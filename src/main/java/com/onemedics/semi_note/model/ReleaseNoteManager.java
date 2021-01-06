package com.onemedics.semi_note.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "release_note_manager")
public class ReleaseNoteManager extends BaseModel {
    @Id
    @GeneratedValue
    @Column(name = "manager_id", nullable = false)
    private int managerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "is_enabled", columnDefinition = "boolean default true")
    private boolean isEnabled;

}