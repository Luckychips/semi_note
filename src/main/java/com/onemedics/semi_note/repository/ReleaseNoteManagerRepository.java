package com.onemedics.semi_note.repository;

import com.onemedics.semi_note.model.ReleaseNoteManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseNoteManagerRepository extends JpaRepository<ReleaseNoteManager, Integer> {
}
