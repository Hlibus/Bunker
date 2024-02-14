package com.petprokect.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "facts", schema = "bunker")
public class Fact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fact_id", nullable = false)
    private Long id;

    @Column(name = "fact_name", nullable = false, length = 45)
    private String factName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFactName() {
        return factName;
    }

    public void setFactName(String factName) {
        this.factName = factName;
    }

}