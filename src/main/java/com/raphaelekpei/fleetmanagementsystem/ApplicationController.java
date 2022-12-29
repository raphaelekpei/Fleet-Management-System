package com.raphaelekpei.fleetmanagementsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ApplicationController {
    // create a method that returns the index page

    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/widgets")
    public String widgets(){
        return "widgets";
    }

}
