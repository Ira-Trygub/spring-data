package com.haw.se1lab;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);

    List<User> findByName(String name);

    long deleteById(long id);
}
