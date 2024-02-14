package com.petprokect.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "health", schema = "bunker")
public class Health {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_id", nullable = false)
    private Long id;

    @Column(name = "health_cond", nullable = false, length = 45)
    private String healthCond;

    @Column(name = "stage", nullable = false)
    private Integer stage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHealthCond() {
        return healthCond;
    }

    public void setHealthCond(String healthCond) {
        this.healthCond = healthCond;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

}