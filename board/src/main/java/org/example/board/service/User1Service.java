package org.example.board.service;

import org.example.board.dao.User1DAO;
import org.example.board.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class User1Service {

    // 스프링 컨테이너의 user1DAO 객체 주입
    @Autowired
    public User1DAO user1DAO;

    public void insertUser1(User1DTO user1DTO) {
        user1DAO.insertUser1(user1DTO);
    }

    public User1DTO selectUser1(int no){
        return user1DAO.selectUser1(no);
    }

    public List<User1DTO> selectAllUser1(){
        return user1DAO.selectAllUser1();
    }

    public void updateUser1(User1DTO user1DTO) {
        user1DAO.updateUser1(user1DTO);
    }

    public void deleteUser1(int no){
        user1DAO.deleteUser1(no);
    }
}