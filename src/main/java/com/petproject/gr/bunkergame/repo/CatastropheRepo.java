package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Catastrophe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatastropheRepo extends JpaRepository<Catastrophe, Long> {
}
