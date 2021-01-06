package com.onemedics.semi_note.repository;

import com.onemedics.semi_note.model.ReleaseNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseNoteRepository extends JpaRepository<ReleaseNote, Integer> {
}
