package com.onemedics.semi_note.graphql.query;

import com.onemedics.semi_note.model.Attachment;
import com.onemedics.semi_note.repository.AttachmentRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttachmentQuery implements GraphQLQueryResolver {
    private final AttachmentRepository attachmentRepository;

    Iterable<Attachment> attachmentFindAll(){
        return attachmentRepository.findAll();
    }
}
