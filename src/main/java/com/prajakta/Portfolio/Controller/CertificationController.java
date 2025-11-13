package com.prajakta.Portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CertificationController {
      // 👇 This handles GET (visiting /contact in browser)
    @GetMapping("/certification")
    public String Certification(Model model) {
        return "certification"; 
    }
    
}
