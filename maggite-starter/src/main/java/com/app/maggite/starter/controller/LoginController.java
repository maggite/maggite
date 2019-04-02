/*
 * 文件名：LoginController.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： LoginController.java
 * 修改人：Administrator
 * 修改时间：2018/4/27
 */
package com.app.maggite.starter.controller;

import com.app.maggite.starter.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/4/27
 */
@RestController
public class LoginController
{
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user)
    {
        String username = user.getName();
        String password = user.getPassword();
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);
        SecurityUtils.getSubject().login(token);

        return "loginSuccess";
    }

    @RequestMapping(value = "/login.html")
    public String login()
    {
        return "login.html";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home()
    {
        Subject subject = SecurityUtils.getSubject();
        User principal = (User)subject.getPrincipal();

        return "Home";
    }
}
