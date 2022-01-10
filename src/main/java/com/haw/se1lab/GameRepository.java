package com.haw.se1lab;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
    User findById(long id);

    long deleteById(long id);
}

