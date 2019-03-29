package com.app.maggite.starter;

import com.app.maggite.foundation.uconfig.UConfigInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2018/4/1.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:META-INF/spring/*.spring.xml"})
public class AppStarter extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        addInitializers(builder);
        return builder.sources(AppStarter.class);
    }

    public static void main(String[] args)
        throws Exception
    {
        SpringApplication application = new SpringApplication(AppStarter.class);
        application.addInitializers();
        application.run(args);
    }

    private static void addInitializers(SpringApplicationBuilder builder)
    {
        builder.initializers(new UConfigInitializer());
    }
}
