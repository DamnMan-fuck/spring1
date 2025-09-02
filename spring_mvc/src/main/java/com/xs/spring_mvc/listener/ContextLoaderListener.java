package com.xs.spring_mvc.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent ServletContextEvent) {
        ServletContext sc = ServletContextEvent.getServletContext();
        //读取web.xml中的全局参数
        String contextConfigLocation = sc.getInitParameter("contextConfigLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring上下文对象存储到ServletContext域中
        //ServletContext sc = ServletContextEvent.getServletContext();
        sc.setAttribute("app", app);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
