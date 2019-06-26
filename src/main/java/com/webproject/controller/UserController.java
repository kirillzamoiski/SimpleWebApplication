package com.webproject.controller;

import com.webproject.entity.User;
import com.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "userList";
    }

    @GetMapping("/user/{employee_id}")
    public String getById(@PathVariable("employee_id") int employee_id, Model model) {
        model.addAttribute("user", userService.getById(employee_id));
        return "showUser";
    }

    @GetMapping("/addUser")
    public String createUserPage(){
        return "createUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/user/" + user.getEmployee_id();
    }

    @GetMapping("/update/{employee_id}")
    public String update(@PathVariable("employee_id") int employee_id, Model model){
        model.addAttribute("user", userService.getById(employee_id));
        return "editUser";
    }

    @GetMapping("/delete/{employee_id}")
    public String deleteUser(@PathVariable("employee_id") int employee_id){
        userService.delete(employee_id);
        return "redirect:/users";
    }
}
