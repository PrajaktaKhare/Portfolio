package com.prajakta.Portfolio.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.prajakta.Portfolio.Model.Project;

import org.springframework.ui.Model;




@Controller
public class ProjectController {
    
    @GetMapping("/projects")
    public String showProjects(Model model) {
        List<Project> projects = Arrays.asList(
                new Project(
                        "TinyBot",
                        "A Chat and games Platform. Implemented a real time chat platform using websocket and spring boot. This page also includes simple game for user engagement.",
                        "/images/project1.jpg",
                        new String[]{"Spring Boot", "Websocket", "JSP","HTML","CSS","JavaScript","Google API integration"},
                        "https://github.com/yourusername/portfolio"
                ),
                new Project(
                    "Family-Hub",
                    "App to match resume skills with required Job skills and get resume improvement suggestion using Open AI model.",
                    "/images/project1.jpg",
                    new String[]{"Node.js", "Express", "MongoDB", "Passport.js", "GraphQL"},
                    "https://github.com/PrajaktaKhare/Family-Hub"
                ),

                new Project(
                    "AI resume-Job matcher",
                    "App to match resume skills with required Job skills and get resume improvement suggestion using Open AI model.",
                    "/images/project1.jpg",
                    new String[]{"Open AI","Langchain","LLM","Streamlit","Pydantic"},
                    "https://github.com/yourusername/ai-resume-job-matcher"
                )
        );
        model.addAttribute("projects", projects);
        return "projects";
    }
    
}
