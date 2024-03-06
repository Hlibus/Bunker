package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role getByRoleName(String name);

}
