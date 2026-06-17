package com.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        String username = "Axel";
        model.addAttribute("username", username);
        return "dashboard";
    }
}
