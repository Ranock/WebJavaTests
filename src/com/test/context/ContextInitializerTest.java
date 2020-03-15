package com.test.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

import com.test.servlets.Test2Servlet;

@WebListener
public class ContextInitializerTest implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("aaa");
//        ServletContext sc = sce.getServletContext();
//        Test2Servlet s = new Test2Servlet();
//        ServletRegistration sr = sc.addServlet("Test2Servlet", s);
//        sr.addMapping("/");        
    }
}
