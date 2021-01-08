package com.onemedics.semi_note.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "anonymous_board")
public class AnonymousBoard extends BaseModel {
    @Id
    @GeneratedValue
    @Column(name = "board_no", nullable = false)
    private int boardNo;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "content")
    private String content;

    @Column(name = "creator_name", nullable = false)
    private String creatorName;
}
