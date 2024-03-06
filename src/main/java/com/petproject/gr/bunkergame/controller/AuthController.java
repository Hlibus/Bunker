package com.petproject.gr.bunkergame.controller;

import com.petproject.gr.bunkergame.dto.UserDto;
import com.petproject.gr.bunkergame.entity.database.Role;
import com.petproject.gr.bunkergame.entity.database.User;
import com.petproject.gr.bunkergame.service.database.RoleService;
import com.petproject.gr.bunkergame.service.database.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    private final UserService userService;

    private final RoleService roleService;

    @Autowired
    public AuthController(UserService userService, RoleService rolerService) {
        this.userService = userService;
        this.roleService = rolerService;
    }

    @GetMapping("/authorization")
    public String getAuthorizationPage(){
        return "loginPage";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registerPage";
    }

    @PostMapping("/registration")
    public String registration(UserDto user
            , HttpServletRequest request){
        //validations front
        if(!user.getPassword().equals(user.getMatchingPassword())
                || userService.isEmailUsed(user.getEmail())){
            return "redirect:/registration";
        }
        String email = user.getEmail();
        String password = user.getPassword();

        userService.registerUser(user, roleService.getUserRole());

        try {
            request.login(email, password);
        } catch (ServletException e) {
            System.out.println("Error while login " + e);//LOGGER
        }
        return "redirect:/";
    }

}
