/*
 * 文件名：UserServiceImpl.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： UserServiceImpl
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.service.service.impl;

import com.app.maggite.service.mapper.UserMapper;
import com.app.maggite.service.service.IUserService;
import com.app.maggite.service.vo.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
 * @version maggite 2019/4/5
 */
@Service
public class UserServiceImpl implements IUserService
{
    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Integer userId)
    {
        return userMapper.getById(userId);
    }

    @Override
    public Page<User> findByPage(Integer pageNum, Integer pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.findByPage();
    }
}
