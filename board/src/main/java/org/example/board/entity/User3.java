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
@Table(name = "User3")
public class User3 {

    @Id
    private String uid;
    private String pass;
    private String name;
    private String birth;
    private String hp;
}