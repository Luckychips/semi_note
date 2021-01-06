package com.onemedics.semi_note.graphql.query;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AnonymousBoardQuery implements GraphQLQueryResolver {
    AnonymousBoardRepository anonymousBoardRepository;

    public Iterable<AnonymousBoard> findAnonymousBoards(){
        return anonymousBoardRepository.findAll();
    }
}
