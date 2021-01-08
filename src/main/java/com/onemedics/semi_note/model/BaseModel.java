package com.onemedics.semi_note.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModel {
    @Column(name = "create_at", insertable = false, updatable = false, nullable = false)
    private Date createAt;

    @Column(name = "update_at", insertable = false, updatable = false, nullable = false)
    private Date updateAt;
}
