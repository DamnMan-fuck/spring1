package com.xs.spring_mvc.listener;

import org.springframework.context.ApplicationContext;
import jakarta.servlet.ServletContext;

public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
