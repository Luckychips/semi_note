package com.onemedics.semi_note.graphql.mutation;

import com.onemedics.semi_note.model.AnonymousBoard;
import com.onemedics.semi_note.repository.AnonymousBoardRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnonymousBoardMutation implements GraphQLMutationResolver {
    private final AnonymousBoardRepository anonymousBoardRepository;

    public AnonymousBoard addAnonymousBoard(AnonymousBoard anonymousBoard){
        return anonymousBoardRepository.save(anonymousBoard);
    }
}
