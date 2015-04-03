/*
 * Copyright 2011-08-31 the original author or authors.
 */
package pl.com.softproject.szkolenie.poznan.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.com.softproject.szkolenie.poznan.srevices.MyService;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@Controller
public class MyController {
    
    @Autowired
    @Qualifier("superService")
    private MyService myService;
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/home")
    public ModelAndView home(@RequestParam(required = false) Integer id) {
        
        logger.debug("MyController.home()");
        
        return new ModelAndView("home");
    }
    
    @RequestMapping("/home/{name}")
    public ModelAndView home2(@PathVariable("name") String name) {
        
        logger.debug("MyController.home2()" + name);
        
        ModelAndView model = new ModelAndView("home");
        
        logger.debug(myService.metoda());
        
        model.addObject("name", name);
        
        return model;
    }
    
}
