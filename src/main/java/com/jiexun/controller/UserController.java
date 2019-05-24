package com.jiexun.controller;

import com.jiexun.entity.User;
import com.jiexun.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/test")
    public String test(Model model) {
        List<User> users = userServiceImpl.getAllUsers();
        users.forEach(user -> {
            System.out.println(user.getName() + "-->" + user.getEmail());
        });
        model.addAttribute("users", users);
        return "userIndex";
    }

    @RequestMapping(value = "/testThymeleaf")
    public String testThymeleaf(ModelMap modelMap) {
        List<User> users = userServiceImpl.getAllUsers();
        modelMap.addAttribute("users", users);
        return "user_thymeleaf";
    }
}
