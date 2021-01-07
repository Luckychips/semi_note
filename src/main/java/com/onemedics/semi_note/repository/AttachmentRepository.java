package com.onemedics.semi_note.repository;

import com.onemedics.semi_note.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

    List<Attachment> findAllByBoardNo(int boardNo);

}

