package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {
}
