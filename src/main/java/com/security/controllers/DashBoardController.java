package com.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.security.records.User;

@Controller
public class DashBoardController {
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // String username = "Axel";
        User myUser = new User("Axel", "ROLE_ADMIN");
        model.addAttribute("user", myUser);
        return "dashboard";
    }
}
