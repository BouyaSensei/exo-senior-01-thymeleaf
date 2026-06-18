package com.security.controllers;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
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
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
        model.addAttribute("user", myUser);

        Authentication auth = new UsernamePasswordAuthenticationToken("Axel", null, authorities);
        SecurityContextHolder.getContext().setAuthentication(auth);
        Boolean errorMessage = true;
        model.addAttribute("ErrorMessage", errorMessage);
        return "dashboard";
    }

    @GetMapping("/dashboard:error")
    public String dashboardError(Model model) {
        Boolean errorMessage = true;
        model.addAttribute("ErrorMessage", errorMessage);
        return "dashboard";

    }
}
