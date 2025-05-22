package org.example.board.dao;

import org.example.board.dto.User1DTO;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class User1DAO {

    private String host = "jdbc:h2:tcp://localhost/~/test";
    private String user = "sa";
    private String pass = "1234";

    public void insertUser1(User1DTO user1DTO) {
        try{
            // 데이터베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);

            // SQL 객체 생성 및 데이터 매핑
            String sql = "INSERT INTO user1 (name, birth, age, addr) VALUES (?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, user1DTO.getName());
            psmt.setString(2, user1DTO.getBirth());
            psmt.setInt(3, user1DTO.getAge());
            psmt.setString(4, user1DTO.getAddr());

            // SQL 실행
            psmt.executeUpdate();

            // 자원해제
            psmt.close();

            // 데이터베이스 종료
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public User1DTO selectUser1(int no){

        // 반환용 DTO 선언
        User1DTO user1DTO = null;

        try{
            Connection conn = DriverManager.getConnection(host, user, pass);

            String sql = "select * from user1 where no = ?";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1, no);

            ResultSet rs = psmt.executeQuery();

            if (rs.next()){
                // userDTO 생성
                user1DTO = new User1DTO();
                user1DTO.setNo(rs.getInt(1));
                user1DTO.setName(rs.getString(2));
                user1DTO.setBirth(rs.getString(3));
                user1DTO.setAge(rs.getInt(4));
                user1DTO.setAddr(rs.getString(5));
            }

            rs.close();
            psmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return user1DTO;
    }

    public List<User1DTO> selectAllUser1(){

        // 반환용 결과 리스트
        List<User1DTO> user1DTOS = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(host, user, pass);

            String sql = "SELECT * FROM user1";
            Statement stmt = conn.createStatement();

            // SQL 실행 후 결과셋 처리
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){ // 커서를 한행씩 내리면서 반복
                // 객체생성
                User1DTO user = new User1DTO();
                user.setNo(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setBirth(rs.getString(3));
                user.setAge(rs.getInt(4));
                user.setAddr(rs.getString(5));

                // 리스트 저장
                user1DTOS.add(user);
            }

            // 자원해제
            rs.close();
            stmt.close();

            // 데이터베이스 종료
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return user1DTOS;
    }

    public void updateUser1(){

        //UPDATE user1 SET name=?, birth=?, age=?, addr=? WHERE no = ?;
    }

    public void deleteUser1(){}


}