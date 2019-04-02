package com.app.maggite.auth.realm;

import java.util.Set;

public class SimpleDbAuthRealm extends AbstractAuthRealm
{
    @Override
    protected Set<String> constructUserPermissions(String userId)
    {
        return null;
    }
}
