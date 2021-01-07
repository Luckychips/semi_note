package com.onemedics.semi_note.graphql.resolver;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.model.Attachment;
import com.onemedics.semi_note.repository.AttachmentRepository;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnonymousBoardResolver implements GraphQLResolver<AnonymousBoard> {

    private final AttachmentRepository attachmentRepository;

    public Iterable<Attachment> getAttachments(AnonymousBoard anonymousBoard){
        return attachmentRepository.findAllByBoardNo(anonymousBoard.getBoardNo());
    }

}
