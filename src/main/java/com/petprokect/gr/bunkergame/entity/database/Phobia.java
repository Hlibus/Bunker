package com.petprokect.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "phobia", schema = "bunker")
public class Phobia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phobia_id", nullable = false)
    private Long id;

    @Column(name = "phobia_name", nullable = false, length = 45)
    private String phobiaName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhobiaName() {
        return phobiaName;
    }

    public void setPhobiaName(String phobiaName) {
        this.phobiaName = phobiaName;
    }

}