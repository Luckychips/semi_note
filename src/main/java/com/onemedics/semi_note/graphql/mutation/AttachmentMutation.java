package com.onemedics.semi_note.graphql.mutation;

import com.onemedics.semi_note.model.Attachment;
import com.onemedics.semi_note.repository.AttachmentRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttachmentMutation implements GraphQLMutationResolver {
    private final AttachmentRepository attachmentRepository;

    public Iterable<Attachment> addAttachments(Iterable<Attachment> attachments){
        return attachmentRepository.saveAll(attachments);
    }

    public Attachment addAttachment(Attachment attachment){
        return attachmentRepository.save(attachment);
    }
}
