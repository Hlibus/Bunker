package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {
}
