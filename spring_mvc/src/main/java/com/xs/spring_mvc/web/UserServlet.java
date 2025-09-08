package com.xs.spring_mvc.web;

import com.xs.spring_mvc.service.UserService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //���ü�����
        ServletContext sc = (ServletContext) req.getServletContext();//����ServletContext sc = this.getServletContext()
        //�Ż�һ��ApplicationContext app =(ApplicationContext)sc.getAttribute("app");
        //�Ż�����ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(sc);

        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext( sc);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
