/*
 * 文件名：AnnotationRegisterListener.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： AnnotationRegisterListener
 * 修改人：Administrator
 * 修改时间：2019/4/15
 */
package com.app.maggite.service.listener;

import com.app.maggite.service.event.AbstractMaggiteEvent;
import com.app.maggite.service.event.Hello;
import com.app.maggite.service.event.IMaggiteEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

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
@Component
public class AnnotationRegisterListener
{
    @EventListener
    public void sayHello(IMaggiteEvent<Hello> helloIMaggiteEvent)
    {
        System.out.println(helloIMaggiteEvent.get().getUserName());
    }
}
