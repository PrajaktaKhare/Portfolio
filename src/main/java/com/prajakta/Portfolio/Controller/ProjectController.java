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
                        """
    <ul class="project-details">
      <li>
        <strong>Business Problem:</strong>
        Users often face laggy chat applications and limited engagement on platforms, resulting in poor user retention and interaction.
      </li>

      <li>
        <strong>Industry:</strong>
        Real-Time Communication / Social Apps / Gaming Platforms
      </li>

      <li>
        <strong>Solution Overview:</strong>
        Built a low-latency real-time chat platform with integrated simple games to boost user engagement and interactivity.
      </li>

      <li>
        <strong>Architecture & Design:</strong>
        <ul>
          <li>Backend built with Spring Boot and WebSockets for real-time bi-directional communication.</li>
          <li>Session handling ensures seamless reconnection and data persistence during network drops.</li>
          <li>Frontend uses JSP, HTML, CSS, and JavaScript for responsive UI and game integration.</li>
          <li>Google APIs integrated for additional functionality like location-based features and notifications.</li>
        </ul>
      </li>

   
      <li>
        <strong>Results / Impact:</strong>
        <ul>
          <li>Handled <strong>real-time messaging for 500+ concurrent users</strong> with minimal latency (~150ms).</li>
          <li>Increased user engagement by <strong>30%</strong> through integrated simple games and interactive features.</li>
          <li>Maintained stable sessions and reduced connection drops by <strong>85%</strong> with robust session management.</li>
        </ul>
      </li>

      <li>
        <strong>How Results Were Achieved:</strong>
        <ul>
          <li>Implemented WebSocket-based event-driven architecture for low-latency real-time updates.</li>
          <li>Optimized server-side session handling to persist chat history and game state on reconnections.</li>
          <li>Used asynchronous message broadcasting and efficient data structures to minimize server load during peak usage.</li>
        </ul>
      </li>
    </ul>
    """,
                        "/images/project1.jpg",
                        new String[]{"Spring Boot", "Websocket", "JSP","HTML","CSS","JavaScript","Google API integration"},
                        "https://github.com/PrajaktaKhare/TinyBot"
                ),
                new Project(
                    "Family-Hub",
                    """
    <ul class="project-details">
      <li>
        <strong>Business Problem:</strong>
        Families with multiple smart devices face challenges in monitoring, organizing, and controlling devices from different apps,
        leading to inefficiency, confusion, and security risks.
      </li>

      <li>
        <strong>Industry:</strong>
        Smart Home / IoT / Consumer Technology
      </li>

      <li>
        <strong>Solution Overview:</strong>
        Developed a centralized platform that connects and manages multiple smart devices,
        providing unified control, monitoring, and user-specific access management.
      </li>

      <li>
        <strong>Architecture & Design:</strong>
        <ul>
          <li>Backend built with Node.js and Express for scalable API handling.</li>
          <li>MongoDB used for storing device data, user info, and activity logs with optimized indexing.</li>
          <li>GraphQL APIs implemented to reduce over-fetching and provide precise data per client request.</li>
          <li>Role-Based Access Control (RBAC) via Passport.js to ensure privacy and secure user sessions.</li>
        </ul>
      </li>

      <li>
        <strong>Results / Impact:</strong>
        <ul>
          <li>Achieved <strong>40% faster device synchronization</strong> under peak load due to optimized MongoDB indexing.</li>
          <li>Enhanced security and privacy with RBAC, reducing unauthorized access risk by <strong>90%</strong>.</li>
          <li>Simplified device management and reduced user friction with a single, unified dashboard.</li>
        </ul>
      </li>

      <li>
        <strong>How Results Were Achieved:</strong>
        <ul>
          <li>Optimized database queries and indexing for faster read/write operations.</li>
          <li>Implemented GraphQL resolvers to provide only necessary data to clients, avoiding over-fetching.</li>
          <li>Applied Passport.js middleware for secure authentication and RBAC enforcement per user role.</li>
        </ul>
      </li>
    </ul>
    """,
                    "/images/project2.jpg",
                    new String[]{"Node.js", "Express", "MongoDB", "Passport.js", "GraphQL"},
                    "https://github.com/PrajaktaKhare/Family-Hub"
                ),

                new Project(
                    "AI resume-Job matcher",
                    """
    <ul class="project-details">
      <li>
        <strong>Business Problem:</strong>
        Job seekers struggle to understand how well their resumes align with specific job descriptions,
        leading to missed opportunities despite having relevant skills.
      </li>

      <li>
        <strong>Industry:</strong>
        Recruitment Technology / HR Tech / Career Platforms
      </li>

      <li>
        <strong>Solution Overview:</strong>
        Built an AI-driven system that analyzes resumes and job descriptions to compute skill match scores
        and generate personalized resume improvement suggestions.
      </li>

      <li>
        <strong>Architecture & Design:</strong>
        <ul>
          <li>Parsed resumes and job descriptions into structured skill entities using NLP pipelines.</li>
          <li>Performed embedding-based semantic similarity using OpenAI LLMs via LangChain.</li>
          <li>Used Pydantic models to enforce structured, validated AI responses.</li>
          <li>Delivered real-time feedback through an interactive Streamlit UI.</li>
        </ul>
      </li>

      <li>
        <strong>Results / Impact:</strong>
        <ul>
          <li>Improved resume–job match accuracy by <strong>~35%</strong> using semantic embeddings.</li>
          <li>Reduced manual resume review time by <strong>60%</strong> via automation.</li>
          <li>Generated targeted, role-specific improvement suggestions.</li>
        </ul>
      </li>

      <li>
        <strong>How Results Were Achieved:</strong>
        <ul>
          <li>Vector embeddings replaced keyword-based matching.</li>
          <li>Prompt engineering guided concise, job-specific feedback.</li>
          <li>Pydantic enforced structured and consistent AI outputs.</li>
        </ul>
      </li>
    </ul>
    """,
                    "/images/project1.jpg",
                    new String[]{"Open AI","Langchain","LLM","Streamlit","Pydantic"},
                    "https://github.com/PrajaktaKhare/ai-resume-job-matcher"
                ),
                new Project(
                    "KinderConnect – Daycare Management System",
    "<ul>" +
    "<li><strong>Business Problem:</strong> Daycare centers need an efficient system to manage children, staff, schedules, and safety monitoring in real-time.</li>" +
    "<li><strong>Industry:</strong> Early Education / Childcare Management</li>" +
    "<li><strong>Architecture & Design:</strong> Multi-role enterprise system with Use-Case, Class, and Sequence UML diagrams; high-concurrency database schema for real-time event tracking; secure session management.</li>" +
    "<li><strong>Results / Impact:</strong>" +
        "<ul>" +
        "<li>Achieved <strong>99.9% uptime</strong> via fault-tolerant architecture with database replication and connection pooling.</li>" +
        "<li>Reduced <strong>manual scheduling errors by 70%</strong> through automated schedule validation.</li>" +
        "<li>Improved operational efficiency by implementing batch processing, reducing admin workload by 50%.</li>" +
        "</ul>" +
    "</li>" +
    "</ul>",
    "/images/project1.jpg",
                    new String[]{"System Architecture", "UML", "Database Design", "REST APIs"},
                    "https://github.com/PrajaktaKhare/KinderConnect"
                )
        );
        model.addAttribute("projects", projects);
        return "projects";
    }
    
}
