package com.gpms.zeCARona.controller;

import com.gpms.zeCARona.DTO.RegisterUserDTO;
import com.gpms.zeCARona.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("registerUserDTO", new RegisterUserDTO());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute RegisterUserDTO registerUserDTO){
        userService.registerUser(registerUserDTO);
        return "redirect:/register?success";
    }
}
