package com.onemedics.semi_note.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.kickstart.tools.GraphQLQueryResolver;
import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import com.onemedics.semi_note.payload.response.AnonymousBoardResponse;

@Component
public class AnonymousBoardQueryResolver implements GraphQLQueryResolver {
    @Autowired AnonymousBoardRepository anonymousBoardRepository;

    public List<AnonymousBoardResponse> findAll() {
        final List<AnonymousBoard> all = anonymousBoardRepository.findAll();
        return AnonymousBoardResponse.from(all);
    }
}
