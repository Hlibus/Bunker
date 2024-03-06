package com.petproject.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "biocharacteristic", schema = "bunker")
public class BioCharacteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bio_char_id", nullable = false)
    private Long id;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "sex", nullable = false, length = 1)
    private String sex;

    @Column(name = "work_exp", nullable = false)
    private Integer workExp;

    @Column(name = "fertility", nullable = false)
    private Byte fertility;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getWorkExp() {
        return workExp;
    }

    public void setWorkExp(Integer workExp) {
        this.workExp = workExp;
    }

    public Byte getFertility() {
        return fertility;
    }

    public void setFertility(Byte fertility) {
        this.fertility = fertility;
    }

}