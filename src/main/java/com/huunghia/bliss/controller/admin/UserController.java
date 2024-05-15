package com.huunghia.bliss.controller.admin;

import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String index(Model model){
        model.addAttribute("users", userService.getUsers());
        return "admin/users/index";
    }

    @GetMapping("/add-user")
    public String createUser(@ModelAttribute("user")User user){
        return "admin/users/add";
    }

    @PostMapping("/add-user")
    public String saveUser(@ModelAttribute("user")User user){

        return "redirect:/users";
    }
}
