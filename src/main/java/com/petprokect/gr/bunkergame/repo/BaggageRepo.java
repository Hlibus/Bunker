package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.database.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaggageRepo extends JpaRepository<Baggage, Long> {
}
