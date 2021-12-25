package com.bulletin.rest.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User implements Serializable{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String password;


    @Builder
    public User(String name,String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }
}