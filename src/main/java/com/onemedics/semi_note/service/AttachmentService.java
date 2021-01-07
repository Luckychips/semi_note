package com.onemedics.semi_note.service;

import com.onemedics.semi_note.model.Attachment;
import com.onemedics.semi_note.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachmentService {
    private final AttachmentRepository attachmentRepository;

    public Iterable<Attachment> attachmentFindAll() {
        return attachmentRepository.findAll();
    }
}
