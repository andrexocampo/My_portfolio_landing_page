package com.portafolio.My_portfolio_landing_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProjectController {
    
    @GetMapping("/projects/{projectId}")
    public String projectDetail(@PathVariable String projectId) {
        switch(projectId) {
            case "defstuf":
                return "project-detail";
            case "project2":
                return "project-detail-2";
            case "project3":
                return "project-detail-3";
            default:
                return "project-detail";
        }
    }
}

