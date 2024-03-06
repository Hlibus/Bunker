package com.petproject.gr.bunkergame.entity.database;

import jakarta.persistence.*;

@Entity
@Table(name = "player", schema = "bunker")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profession_id", nullable = false)
    private Profession profession;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bio_char_id", nullable = false)
    private BioCharacteristic bioChar;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "health_id", nullable = false)
    private Health health;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hobby_id", nullable = false)
    private Hobby hobby;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "baggage_id", nullable = false)
    private Baggage baggage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "phobia_id", nullable = false)
    private Phobia phobia;

    @Column(name = "fact_one", length = 45)
    private String factOne;

    @Column(name = "fact_two", length = 45)
    private String factTwo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public BioCharacteristic getBioChar() {
        return bioChar;
    }

    public void setBioChar(BioCharacteristic bioChar) {
        this.bioChar = bioChar;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Phobia getPhobia() {
        return phobia;
    }

    public void setPhobia(Phobia phobia) {
        this.phobia = phobia;
    }

    public String getFactOne() {
        return factOne;
    }

    public void setFactOne(String factOne) {
        this.factOne = factOne;
    }

    public String getFactTwo() {
        return factTwo;
    }

    public void setFactTwo(String factTwo) {
        this.factTwo = factTwo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}