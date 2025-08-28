package com.xs.spring_ioc.config;

import org.springframework.context.annotation.*;

//标志该类是spring的核心配置类
@Configuration
//替代<context:component-scan base-package="com.xs.spring_ioc"/>
@ComponentScan("com.xs.spring_ioc")
//替代<import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
