package com.onemedics.semi_note.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "release_note")
public class ReleaseNote extends BaseModel {
    @Id
    @GeneratedValue
    @Column(name = "note_no", nullable = false)
    private int noteNo;

    @Column(name = "note_version")
    private String noteVersion;

    @Column(name = "note_content")
    private String noteContent;

    @Column(name = "debug_file_path")
    private String debugFilePath;

    @Column(name = "debug_file_download_count")
    private int debugFileDownloadCount;

    @Column(name = "release_file_path")
    private String releaseFilePath;

    @Column(name = "release_file_download_count")
    private int releaseFileDownloadCount;

    @Column(name = "creator_id", nullable = false)
    private int creatorId;

    @Column(name = "updater_id", nullable = false)
    private int updaterId;
}