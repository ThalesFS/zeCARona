package com.gpms.zeCARona.controller;

import com.gpms.zeCARona.DTO.LoginDTO;
import com.gpms.zeCARona.entity.User;
import com.gpms.zeCARona.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String showLoginForm(Model model) {
        model.addAttribute("loginDTO", new LoginDTO());
        return "login";
    }

    @PostMapping
    public String loginUser(@ModelAttribute LoginDTO loginDTO, Model model, HttpSession session) {

        User user = userRepository.findByEmail(loginDTO.getEmail());

        if (user != null && user.getSenha().equals(loginDTO.getSenha())) {
            // Sucesso no login (alguma hora implementar sessão)

            session.setAttribute("id_user", user.getId_user());
            model.addAttribute("user", user);

            return "redirect:/home"; // Pagina inicial

        } else { // Falha no login

            model.addAttribute("error", "E-mail ou senha inválidos.");
            return "login";
        }
    }
}