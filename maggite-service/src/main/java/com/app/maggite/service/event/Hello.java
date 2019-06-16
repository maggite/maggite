/*
 * 文件名：Hello.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： Hello
 * 修改人：Administrator
 * 修改时间：2019/4/15
 */
package com.app.maggite.service.event;

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
 * @version maggite 2019/4/15
 */
public class Hello
{
    private String userName;

    private String target;

    public Hello()
    {
    }

    public Hello(String userName, String target)
    {
        this.userName = userName;
        this.target = target;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getTarget()
    {
        return target;
    }

    public void setTarget(String target)
    {
        this.target = target;
    }
}
