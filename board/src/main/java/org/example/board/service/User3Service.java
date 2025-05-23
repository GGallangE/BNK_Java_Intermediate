package org.example.board.service;

import jakarta.transaction.Transactional;
import org.example.board.entity.User3;
import org.example.board.repository.User3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class User3Service {

    @Autowired
    private User3Repository user3Repository;

    public void save(User3 user3) {
        user3Repository.save(user3);
    }

    public List<User3> findAll(){
        return user3Repository.findAll();
    }

    public User3 findById(String uid){
        Optional<User3> optUser3 = user3Repository.findById(uid);
        if(optUser3.isPresent()){
            User3 user3 = optUser3.get();
            return user3;
        }
        return null;
    }

    @Transactional
    public void update(User3 user3){

        Optional<User3> optUser3 = user3Repository.findById(user3.getUid());

        if(optUser3.isPresent()){

            User3 savedUser3 = optUser3.get();
            savedUser3.setName(user3.getName());
            savedUser3.setPass(user3.getPass());
            savedUser3.setBirth(user3.getBirth());
            savedUser3.setHp(user3.getHp());
        }
    }

    public void delete(String uid){
        user3Repository.deleteById(uid);
    }
}