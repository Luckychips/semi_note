package com.onemedics.semi_note.payload.response;

import java.util.*;
import java.util.stream.Collectors;
import lombok.*;
import com.onemedics.semi_note.model.AnonymousBoard;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnonymousBoardResponse {
    private int boardNo;
    private String title;
    private String password;
    private String content;
    private String creatorName;
    private Date createAt;
    private Date updateAt;

    public static List<AnonymousBoardResponse> from(Collection<AnonymousBoard> entities) {
        return entities.stream().map(AnonymousBoardResponse::from).collect(Collectors.toList());
    }

    public static AnonymousBoardResponse from(AnonymousBoard entity) {
        return AnonymousBoardResponse.builder()
            .boardNo(entity.getBoardNo())
            .title(entity.getTitle())
            .password(entity.getPassword())
            .content(entity.getContent())
            .creatorName(entity.getCreatorName())
            .createAt(entity.getCreateAt())
            .updateAt(entity.getUpdateAt())
            .build();
    }
}