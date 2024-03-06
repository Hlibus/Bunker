package com.petproject.gr.bunkergame.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @PreAuthorize("hasRole('player')")
    @GetMapping("/")
    public String getMainPage(){
        return "mainPage";
    }

}
