package org.example.board.service;

import org.example.board.entity.User2;
import org.example.board.repository.User2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User2Service {

    @Autowired
    private User2Repository user2Repository;

    public void save(User2 user2) {
        // 등록
        user2Repository.save(user2);
    }

    public void findById(){}

    public List<User2> findAll(){
        return user2Repository.findAll();
    }

    public void update(){}

    public void delete(){}



}