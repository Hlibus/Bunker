package com.petprokect.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "baggage", schema = "bunker")
public class Baggage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "baggage_id", nullable = false)
    private Long id;

    @Column(name = "baggage_name", nullable = false, length = 45)
    private String baggageName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaggageName() {
        return baggageName;
    }

    public void setBaggageName(String baggageName) {
        this.baggageName = baggageName;
    }

}