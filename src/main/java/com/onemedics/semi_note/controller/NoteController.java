package com.onemedics.semi_note.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @RequestMapping("/hello")
    public String getTestStr() throws Exception {
        return "hello_world";
    }
}
