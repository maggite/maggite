/*
 * 文件名：UserMapper.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： UserMapper
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.service.mapper;

import com.app.maggite.service.vo.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
@Repository
@Mapper
public interface UserMapper
{
    User getById(@Param("userId") int userId);

    int updateUser(User user);

    int insertUser(User user);

    int deleteById(@Param("userId") int userId);

    Page<User> findByPage();
}
