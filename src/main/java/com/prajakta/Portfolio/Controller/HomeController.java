package com.prajakta.Portfolio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


public class HomeController {
   

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        return "projects";
    }

    @GetMapping("/skills")
    public String skills() {
        return "skills";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}