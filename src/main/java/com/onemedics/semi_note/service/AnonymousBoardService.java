package com.onemedics.semi_note.service;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnonymousBoardService {
    private final AnonymousBoardRepository anonymousBoardRepository;

    public Iterable<AnonymousBoard> anonymousBoardFindAll() {
        return anonymousBoardRepository.findAll();
    }


}
