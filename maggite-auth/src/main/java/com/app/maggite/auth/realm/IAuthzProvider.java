/*
 * 文件名：IAuthzProvider.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： IAuthzProvider
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.auth.realm;

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
public interface IAuthzProvider
{
    Set<String> provide(String userId);
}
