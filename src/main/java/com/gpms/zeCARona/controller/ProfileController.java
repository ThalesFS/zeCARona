package com.gpms.zeCARona.controller;

import com.gpms.zeCARona.entity.User;
import com.gpms.zeCARona.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/profile")
    public String viewProfile(HttpSession session, Model model) {
        Long id_user = (Long) session.getAttribute("id_user");
        if (id_user != null) {
            User user = userRepository.findById(id_user).orElse(null);
            model.addAttribute("user", user);
            return "profile";
        } else {
            return "redirect:/login";
        }
    }
}