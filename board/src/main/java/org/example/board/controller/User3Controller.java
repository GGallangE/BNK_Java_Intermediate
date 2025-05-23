package org.example.board.controller;

import org.example.board.entity.User3;
import org.example.board.repository.User3Repository;
import org.example.board.service.User3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class User3Controller {

    @Autowired
    private User3Service user3Service;

    @GetMapping("/user3/list")
    public String list(Model model) {
        List<User3> user3List = user3Service.findAll();

        model.addAttribute("user3List", user3List);

        return "/user3/list";
    }

    @GetMapping("/user3/register")
    public String register(){
        return "/user3/register";
    }

    @PostMapping("/user3/register")
    public String register(User3 user3){
        user3Service.save(user3);
        return "redirect:/user3/list";
    }

    @GetMapping("/user3/modify")
    public String modify(String uid, Model model){

        User3 user3 = user3Service.findById(uid);
        model.addAttribute(user3);
        return "/user3/modify";
    }

    @PostMapping("/user3/modify")
    public String modify(User3 user3){

        user3Service.update(user3);
        return "redirect:/user3/list";
    }

    @GetMapping("/user3/delete")
    public String delete(String uid){
        user3Service.delete(uid);
        return "/user3/list";
    }
}