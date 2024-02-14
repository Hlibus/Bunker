package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.database.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
