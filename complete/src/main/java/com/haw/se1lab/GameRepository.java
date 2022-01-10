package com.haw.se1lab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("select g from Game g where g.id = :id")
    Optional<User> findById(@Param("GameID") long id);



    @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByGameId(long id);
}

