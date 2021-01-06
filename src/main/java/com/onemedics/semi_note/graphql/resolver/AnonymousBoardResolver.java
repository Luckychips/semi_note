package com.onemedics.semi_note.graphql.resolver;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.model.Attachment;
import com.onemedics.semi_note.repository.AttachmentRepository;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AnonymousBoardResolver implements GraphQLResolver<AnonymousBoard> {
    AttachmentRepository attachmentRepository;

    public Iterable<Attachment> getAttachments(AnonymousBoard anonymousBoard){
        return attachmentRepository.findAllByBoardNo(anonymousBoard.getBoardNo());
    }
}
