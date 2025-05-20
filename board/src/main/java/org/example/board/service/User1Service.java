package org.example.board.service;

import org.example.board.dao.User1DAO;
import org.example.board.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {

    // 스프링 컨테이너의 user1DAO 객체 주입
    public User1DAO user1DAO;

    @Autowired
    public User1Service(User1DAO user1DAO) {
        this.user1DAO = user1DAO;
    }

    public void insertUser1(User1DTO user1DTO) {
        user1DAO.insertUser1(user1DTO);
    }

    public void selectUser1(){
        user1DAO.selectUser1();
    }

    public void selectAllUser1(){
        user1DAO.selectAllUser1();
    }

    public void updateUser1(){
        user1DAO.updateUser1();
    }

    public void deleteUser1(){
        user1DAO.deleteUser1();
    }
    
}
