package com.bila.servlet.servlet_container_initializer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Magician
 * @Desc: 通过@WebServlet注解配置Servlet
 * @Date: 2020/06/23
 * @Modify By:
 */
@WebServlet(name = "webDemo", urlPatterns = "/web/demo")
public class DemoWebServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello WebServlet");
    }
}
