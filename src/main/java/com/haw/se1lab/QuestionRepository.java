package com.haw.se1lab;

import com.haw.se1lab.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("select c from Question c where c.id = :id")
    Optional<Question> findById(@Param("QuestionID") long id);


    @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByQuestionId(long id);
}
