package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactRepo extends JpaRepository<Fact, Long> {
}
