package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/*"})
public class Test2Servlet extends HttpServlet{

    /**
     * 
     */
    private static final long serialVersionUID = 3209846009100641681L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter w =  resp.getWriter();
        resp.setContentType("text/plain");
        w.println(req.getContextPath());
        w.println(req.getLocalPort());
        w.println(req.getMethod());
        w.println(req.getRemotePort());
        w.println(req.getRemoteHost());
        w.println(req.getServerName());
        w.println(req.getRequestURL());
        w.println(req.getRequestURI());
        w.close();
//        super.service(req, resp);
    }
}
