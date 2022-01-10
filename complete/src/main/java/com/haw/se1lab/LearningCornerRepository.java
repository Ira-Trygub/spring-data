package com.haw.se1lab;

import com.haw.se1lab.LearningCorner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface LearningCornerRepository extends JpaRepository<LearningCorner, Long> {

    @Query("select c from LearningCorner c where c.id = :id")
    Optional<LearningCorner> findById(@Param("LearningCornerID") long id);

    @Query("select c from LearningCorner c where c.name = :name")
    List<LearningCorner> findByName(@Param("name") String name);

    @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByLearningCornerId(long id);
}
