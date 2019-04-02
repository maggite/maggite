package com.app.maggite.auth.realm;

import com.app.maggite.base.vo.UserToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Set;

public abstract class AbstractAuthRealm extends AuthorizingRealm
{
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals)
    {
        //获取用户
        UserToken user = (UserToken) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //获取用户权限
        Set<String> permissionSet = constructUserPermissions(user.getUserId());
        info.setStringPermissions(permissionSet);

        return info;
    }

    protected abstract Set<String> constructUserPermissions(String userId);

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException
    {
        UsernamePasswordToken t = (UsernamePasswordToken) token;
        String username = t.getUsername();
        String password = String.valueOf(t.getPassword());

        UserToken user = new UserToken();
        user.setUserName(username);
        user.setPassword(password);

        // return new SimpleAuthenticationInfo(user, password, getName());

        return constructAuthentication(user);
    }

    protected AuthenticationInfo constructAuthentication(UserToken user)
    {
        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }
}
