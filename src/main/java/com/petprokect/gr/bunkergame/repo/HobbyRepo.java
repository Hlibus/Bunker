package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepo extends JpaRepository<Hobby, Long> {
}
