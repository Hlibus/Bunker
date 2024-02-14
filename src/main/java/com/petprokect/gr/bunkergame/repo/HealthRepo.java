package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.database.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepo extends JpaRepository<Health, Long> {
}
