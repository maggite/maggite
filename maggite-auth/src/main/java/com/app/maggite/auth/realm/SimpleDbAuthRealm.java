package com.app.maggite.auth.realm;

import java.util.Set;

public class SimpleDbAuthRealm extends AbstractAuthRealm
{
    private IAuthzProvider provider;

    public SimpleDbAuthRealm(IAuthzProvider provider)
    {
        this.provider = provider;
    }

    @Override
    protected Set<String> constructUserPermissions(String userId)
    {
        return provider.provide(userId);
    }
}
