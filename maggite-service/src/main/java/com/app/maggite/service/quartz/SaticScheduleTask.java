/*
 * 文件名：SaticScheduleTask.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： SaticScheduleTask
 * 修改人：Administrator
 * 修改时间：2019/4/15
 */
package com.app.maggite.service.quartz;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

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
@Configuration
@EnableScheduling
public class SaticScheduleTask
{
    //3.添加定时任务
    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks()
    {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }
}
