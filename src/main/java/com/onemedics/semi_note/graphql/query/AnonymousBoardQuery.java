package com.onemedics.semi_note.graphql.query;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnonymousBoardQuery implements GraphQLQueryResolver {

    private final AnonymousBoardRepository anonymousBoardRepository;

    Iterable<AnonymousBoard> anonymousBoardFindAll(){
        return anonymousBoardRepository.findAll();
    }
}
