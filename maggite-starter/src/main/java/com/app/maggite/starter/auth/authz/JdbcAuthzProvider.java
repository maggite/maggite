/*
 * 文件名：JdbcAuthzProvider.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： JdbcAuthzProvider
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.starter.auth.authz;

import com.app.maggite.auth.realm.IAuthzProvider;
import com.app.maggite.service.service.IPrivilegeService;
import com.app.maggite.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

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
public class JdbcAuthzProvider implements IAuthzProvider
{
    @Autowired
    private IPrivilegeService privilegeService;

    @Override
    public Set<String> provide(String userId)
    {
        return null;
    }
}
