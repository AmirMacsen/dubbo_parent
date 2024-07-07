package org.amir.dubbo_consumer.controller;

import org.amir.dubbo_consumer.service.UserService;
import org.amir.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/ok";
    }

    @RequestMapping("/findUsers")
    public ModelAndView findUsers() {
        List<User> allUser = userService.findAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", allUser);
        modelAndView.setViewName("showUsers");
        return modelAndView;
    }

    @RequestMapping("/preUpdateUser")
    private ModelAndView preUpdateUser(Integer userid) {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.preUpdateUser(userid);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("updateUser");
        return modelAndView;
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/ok";
    }

    @RequestMapping("/delelteByUserId")
    public String delelteByUserId(Integer userid) {
        userService.deleteUserById(userid);
        return "redirect:/ok";
    }
}
