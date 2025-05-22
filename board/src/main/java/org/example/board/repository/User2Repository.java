package org.example.board.repository;

import org.example.board.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User2Repository extends JpaRepository<User2, String> { // User2 엔티티의 @Id의 자료형
}