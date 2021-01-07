package com.onemedics.semi_note.repository;

import com.onemedics.semi_note.model.AnonymousBoard;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnonymousBoardRepository extends PagingAndSortingRepository<AnonymousBoard, Integer> {
    List<AnonymousBoard> findAll();
}
