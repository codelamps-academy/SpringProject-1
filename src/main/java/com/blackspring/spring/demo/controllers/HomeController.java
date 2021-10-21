package com.blackspring.spring.demo.controllers;

import com.blackspring.spring.demo.services.ServiceCoronavirus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ServiceCoronavirus serviceCoronavirus;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats", serviceCoronavirus.getAllStats());
        return "home";
    }

}
