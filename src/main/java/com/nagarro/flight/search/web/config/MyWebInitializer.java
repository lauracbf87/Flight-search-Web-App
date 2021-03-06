/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.*;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Laura.Barragan
 */
public class MyWebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        // Create the 'root' Spring application context
      AnnotationConfigWebApplicationContext rootContext =
        new AnnotationConfigWebApplicationContext();
      rootContext.register(WebAppConfig.class);

      // Manage the lifecycle of the root application context
      //container..addListener(new ContextLoaderListener(rootContext));

      // Create the dispatcher servlet's Spring application context
      AnnotationConfigWebApplicationContext dispatcherContext =
        new AnnotationConfigWebApplicationContext();
      dispatcherContext.register(DispatcherConfig.class);

      // Register and map the dispatcher servlet
      //ServletRegistration.Dynamic dispatcher =
      //  container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
      //dispatcher.setLoadOnStartup(1);
      //dispatcher.addMapping("/");
    }
    
    
}
