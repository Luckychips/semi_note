package com.onemedics.semi_note.repository;

import com.onemedics.semi_note.model.AnonymousBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnonymousBoardRepository extends JpaRepository<AnonymousBoard, Integer> {}

