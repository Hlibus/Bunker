package com.petprokect.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "hobby", schema = "bunker")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hobby_id", nullable = false)
    private Long id;

    @Column(name = "hobby_name", nullable = false, length = 45)
    private String hobbyName;

    @Column(name = "hobby_exp", nullable = false)
    private Integer hobbyExp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public Integer getHobbyExp() {
        return hobbyExp;
    }

    public void setHobbyExp(Integer hobbyExp) {
        this.hobbyExp = hobbyExp;
    }

}