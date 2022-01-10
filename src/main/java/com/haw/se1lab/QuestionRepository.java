package com.haw.se1lab;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    Question findById(long id);

    long deleteById(long id);
}
