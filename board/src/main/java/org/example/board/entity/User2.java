package org.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "User2")
public class User2 {

    @Id
    private String uid;
    private String name;
    private String birth;
    private String gender;
    private String address;
}