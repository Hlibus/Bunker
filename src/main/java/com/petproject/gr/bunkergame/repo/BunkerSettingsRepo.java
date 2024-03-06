package com.petproject.gr.bunkergame.repo;

import com.petproject.gr.bunkergame.entity.database.BunkerSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BunkerSettingsRepo extends JpaRepository<BunkerSetting, Long> {
}
