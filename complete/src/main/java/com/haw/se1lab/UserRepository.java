package com.haw.se1lab;

import com.haw.se1lab.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select c from User c where c.id = :id")
    Optional<User> findById(@Param("UserID") long id);

    @Query("select c from User c where c.name = :name")
    List<User> findByName(@Param("name") String name);

    @Transactional
        // causes the method to be executed in a database transaction (required for write operations)
    void deleteByUserId(long id);
}
