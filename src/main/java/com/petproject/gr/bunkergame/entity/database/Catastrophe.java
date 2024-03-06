package com.petproject.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "catastrophe", schema = "bunker")
public class Catastrophe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catastrophe_id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Column(name = "catastrophe_name", nullable = false, length = 45)
    private String catastropheName;

    @Column(name = "catastrophe_description", nullable = false, length = 500)
    private String catastropheDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatastropheName() {
        return catastropheName;
    }

    public void setCatastropheName(String catastropheName) {
        this.catastropheName = catastropheName;
    }

    public String getCatastropheDescription() {
        return catastropheDescription;
    }

    public void setCatastropheDescription(String catastropheDescription) {
        this.catastropheDescription = catastropheDescription;
    }

}