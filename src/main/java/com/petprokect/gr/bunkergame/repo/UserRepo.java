package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select a from User a where a.username = :login and a.password = :pass")
    User getUserByLoginAndPassword(@Param("login") String login
            ,@Param("pass") String pas);


    Optional<User> findByUsername(String username);
}
