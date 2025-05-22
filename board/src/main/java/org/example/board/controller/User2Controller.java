package org.example.board.controller;

import org.example.board.entity.User2;
import org.example.board.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class User2Controller {

    @Autowired
    private User2Service user2Service;

    @GetMapping("/user2/list")
    public String list(Model model) {

        List<User2> user2List = user2Service.findAll();

        model.addAttribute("user2List", user2List);

        return "/user2/list";
    }

    @GetMapping("/user2/register")
    public String register(){
        return "/user2/register";
    }

    @PostMapping("/user2/register")
    public String register(User2 user2){
        System.out.println(user2);
        user2Service.save(user2);

        return "redirect:/user2/list";
    }

    @GetMapping("/user2/modify")
    public String modify(){
        return "/user2/modify";
    }
}