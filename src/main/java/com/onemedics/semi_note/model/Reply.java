package com.onemedics.semi_note.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "reply")
public class Reply extends BaseModel {
    @Id
    @GeneratedValue
    @Column(name = "reply_no")
    private int replyNo;

    @Column(name = "board_no")
    private int boardNo;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "creator_name")
    private String creatorName;
}
