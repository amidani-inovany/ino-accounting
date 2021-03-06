package com.inovany.accounting.repository;

import com.inovany.accounting.domain.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the {@link User} entity.
 */
@Repository
public interface UserRepository extends Neo4jRepository<User, String> {
    Optional<User> findOneByLogin(String login);

    // See https://github.com/neo4j/sdn-rx/issues/51
    List<User> findAll();

    Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);
}
