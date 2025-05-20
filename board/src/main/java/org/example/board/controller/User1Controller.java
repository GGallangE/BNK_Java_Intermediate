package org.example.board.controller;

import org.example.board.dto.User1DTO;
import org.example.board.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User1Controller {

    @Autowired
    private User1Service user1Service;

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO user1DTO){

        System.out.println(user1DTO);

        user1Service.insertUser1(user1DTO);

        return "/user1/register";
    }
}
