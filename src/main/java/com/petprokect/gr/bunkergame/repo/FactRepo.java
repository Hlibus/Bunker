package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactRepo extends JpaRepository<Fact, Long> {
}
