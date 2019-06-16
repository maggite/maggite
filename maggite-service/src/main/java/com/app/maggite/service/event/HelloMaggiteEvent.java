/*
 * 文件名：HelloMaggiteEvent.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： HelloMaggiteEvent
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
public class HelloMaggiteEvent extends AbstractMaggiteEvent<Hello>
{
    public HelloMaggiteEvent(Hello hello)
    {
        super(hello);
    }
}
