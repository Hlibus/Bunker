package com.petproject.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "profession", schema = "bunker")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profession_id", nullable = false)
    private Long id;

    @Column(name = "profession_name", nullable = false, length = 45)
    private String professionName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

}