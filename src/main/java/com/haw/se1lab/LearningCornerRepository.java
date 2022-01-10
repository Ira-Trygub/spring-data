package com.haw.se1lab;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LearningCornerRepository extends CrudRepository<LearningCorner, Long> {
    LearningCorner findById(long id);

    List<LearningCorner> findByTheme(String theme);

    long deleteById(long id);
}
