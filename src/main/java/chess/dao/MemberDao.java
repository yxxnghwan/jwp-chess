package chess.dao;

import chess.domain.Member;
import java.util.List;
import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface MemberDao {

    Long save(final Member member);

    Optional<Member> findById(final Long id);

    List<Member> findAll();

    void deleteById(final Long id);
}
