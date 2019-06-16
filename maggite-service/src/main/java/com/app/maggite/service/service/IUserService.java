/*
 * 文件名：IUserService.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： IUserService
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.service.service;

import com.app.maggite.service.vo.User;
import com.github.pagehelper.Page;

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
public interface IUserService
{
    User getById(Integer userId);

    Page<User> findByPage(Integer pageNum, Integer pageSize);
}
