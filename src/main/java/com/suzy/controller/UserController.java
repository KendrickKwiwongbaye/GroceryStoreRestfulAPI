package com.suzy.controller;


import com.suzy.entity.User;
import com.suzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/sign-up")
    public ModelAndView signup(Model model){

        return new ModelAndView("sign-up", "user", new User());
    }

    @PostMapping("/sign-up")
    public ModelAndView saveUser(@ModelAttribute User user, Model model){
        User signedUpUser = userService.saveUser(user);
        return new ModelAndView("profile", "user", signedUpUser);
    }

    @GetMapping("/sign-in")
    public ModelAndView signin(Model model){

        return new ModelAndView("sign-in", "user", new User());
    }


    @PostMapping("/sign-in")
    public String signedInUser(@ModelAttribute User user, Model model){
        User signedUpUser = userService.signedInUser(user.getEmail(), user.getPassword());

        if(signedUpUser == null){
            model.addAttribute("error", "Invalid USERNAME/PASSWORD");
            model.addAttribute("user", new User());
             return "sign-in";
        }

        return "profile";
    }
}
