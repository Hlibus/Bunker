package com.petprokect.gr.bunkergame.repo;

import com.petprokect.gr.bunkergame.entity.BioCharacteristic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BioCharacteristicRepo extends JpaRepository<BioCharacteristic, Long> {
}
