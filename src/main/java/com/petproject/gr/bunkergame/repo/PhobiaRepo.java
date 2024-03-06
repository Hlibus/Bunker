package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Phobia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhobiaRepo extends JpaRepository<Phobia, Long> {
}
