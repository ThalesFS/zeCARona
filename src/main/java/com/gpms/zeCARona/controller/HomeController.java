package com.gpms.zeCARona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(Model model) {
        return "home";
    }

    // Adicione os métodos de mapeamento para as outras ações conforme necessário
    /*@GetMapping("/requestRide")
    public String requestRide(Model model) {
        // Implementação para "Pedir Carona"
        return "requestRide";
    }

    @GetMapping("/offerRide")
    public String offerRide(Model model) {
        // Implementação para "Oferecer Carona"
        return "offerRide";
    }

    @GetMapping("/listRides")
    public String listRides(Model model) {
        // Implementação para "Listar Caronas"
        return "listRides";
    }

    @GetMapping("/profile")
    public String viewProfile(Model model) {
        // Redireciona para a página de perfil
        return "profile";
    }*/
}