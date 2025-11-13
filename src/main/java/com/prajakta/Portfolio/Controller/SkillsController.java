package com.prajakta.Portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkillsController {
    // 👇 This handles GET (visiting /contact in browser)
    @GetMapping("/skills")
    public String skills(Model model) {
        return "skills"; 
    }
    
}
