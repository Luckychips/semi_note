package com.onemedics.semi_note.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "attachment")
public class Attachment {
    @Id
    @GeneratedValue
    @Column(name = "file_no", nullable = false)
    private int fileNo;

    @Column(name = "board_no")
    private int boardNo;

    @Column(name = "file_path")
    private String filePath;
}
