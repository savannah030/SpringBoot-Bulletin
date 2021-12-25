package com.bulletin.rest.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder
    public Board(String title, String content, User user){
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public void update(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }

}
