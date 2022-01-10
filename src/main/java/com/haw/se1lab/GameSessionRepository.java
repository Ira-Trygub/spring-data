package com.haw.se1lab;


import com.haw.se1lab.GameSession;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;


public interface GameSessionRepository {
    @Query("select c from GameSession c where c.id = :id")
    Optional<GameSession> findById(@Param("GameSessionID") long id);

      @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByUserId(long id);
}
