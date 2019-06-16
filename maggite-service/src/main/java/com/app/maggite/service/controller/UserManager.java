/*
 * 文件名：UserManager.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： UserManager
 * 修改人：Administrator
 * 修改时间：2019/4/6
 */
package com.app.maggite.service.controller;

import com.app.maggite.service.event.Hello;
import com.app.maggite.service.event.HelloMaggiteEvent;
import com.app.maggite.service.service.IUserService;
import com.app.maggite.service.vo.User;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
 * @version maggite 2019/4/6
 */
@RestController
@RequestMapping("/users")
public class UserManager
{
    @Autowired
    private IUserService userService;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/{userId}")
    public User findById(@PathVariable("userId") Integer userId)
    {
        return userService.getById(userId);
    }

    @GetMapping("/page")
    public Page<User> findByPage(@RequestParam(value = "pageNum", required = false, defaultValue = "0") Integer pageNum,
        @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize)
    {
        applicationContext.publishEvent(new HelloMaggiteEvent(new Hello("wpc", "bfh")));
        return userService.findByPage(pageNum, pageSize);
    }
}
