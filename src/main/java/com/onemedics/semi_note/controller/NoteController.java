package com.onemedics.semi_note.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.service.AnonymousBoardService;

@RestController
@RequestMapping("/note")
public class NoteController {
    @Autowired AnonymousBoardService anonymousBoardService;

    @RequestMapping("/hello")
    @ResponseBody
    public List<AnonymousBoard> getBoards() throws IOException {
        return anonymousBoardService.getBoards();
    }
}
