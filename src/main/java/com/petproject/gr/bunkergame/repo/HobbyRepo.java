package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepo extends JpaRepository<Hobby, Long> {
}
