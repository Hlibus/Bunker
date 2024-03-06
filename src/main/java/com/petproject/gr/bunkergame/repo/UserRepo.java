package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select a from User a where a.email = :email and a.password = :pass")
    User getUserByEmailAndPassword(@Param("email") String email
            ,@Param("pass") String pas);


    Optional<User> findByUsername(String username);

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
