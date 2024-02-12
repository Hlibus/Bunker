package com.petprokect.gr.bunkergame.controller;

import com.petprokect.gr.bunkergame.entity.User;
import com.petprokect.gr.bunkergame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    //@PostMapping("/authorization")
    public String authorization(User user//DTO
            , RedirectAttributes redirectAttributes){

        //validations front

        String login = user.getUsername();
        String pas = user.getPassword();

        User existingUser = userService.getUserByLoginAndPassword(login, pas);
        System.out.println(existingUser);


        if(existingUser != null){
            redirectAttributes.addFlashAttribute("user", existingUser);
            return "redirect:/";
        }
        return "redirect:/authorization";
    }

    //@PostMapping("/registration")
    public String registration(@RequestBody User user
            , RedirectAttributes redirectAttributes){

        //validations front

        userService.saveOrUpdateUser(user);

        redirectAttributes.addFlashAttribute("user", user);
        return "redirect:/";
    }

}
