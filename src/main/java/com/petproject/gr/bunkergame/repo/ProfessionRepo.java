package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepo extends JpaRepository<Profession, Long> {
}
