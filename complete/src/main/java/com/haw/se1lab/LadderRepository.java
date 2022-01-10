package com.haw.se1lab;

import com.haw.se1lab.Ladder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface LadderRepository extends JpaRepository<Ladder, Long> {

    @Query("select c from Ladder c where c.id = :id")
    Optional<Ladder> findById(@Param("LadderID") long id);



    @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByLadderId(long id);
}
