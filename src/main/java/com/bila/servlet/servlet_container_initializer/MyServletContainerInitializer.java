package com.bila.servlet.servlet_container_initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.HandlesTypes;

import com.bila.servlet.servlet_container_initializer.service.HandlesTypesService;

/**
 * @Author: Magician
 * @Desc: 通过SPI方式启动MyServletContainerInitializer#onStartup
 *        在MATA-INF/services中创建服务
 * @Date: 2020/06/22
 * @Modify By:
 */
@HandlesTypes(value = HandlesTypesService.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     *
     * @param set @HandlesTypes 中类的所有子类/子接口/实现
     * @param servletContext Servlet上下文
     *                       一个web应用对应一个ServletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyServletContainerInitializer start...");

        for(Class<?> clazz : set) {
            System.out.println(clazz);
        }

        /*
         * ServletContext 注册三大件 Servlet / Filter / Listener
         */
        Dynamic dynamic = servletContext.addServlet("demo", new DemoServlet());
        dynamic.addMapping("/demo");

    }
}
