package com.onemedics.semi_note.service;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnonymousBoardService {
    @Autowired AnonymousBoardRepository anonymousBoardRepository;

    public List<AnonymousBoard> getBoards() {
        return anonymousBoardRepository.findAll();
    }
}