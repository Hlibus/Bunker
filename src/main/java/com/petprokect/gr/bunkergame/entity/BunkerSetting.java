package com.petprokect.gr.bunkergame.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bunkersettings", schema = "bunker")
public class BunkerSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "settings_id", nullable = false)
    private Long id;

    @Column(name = "bunker_capacity", nullable = false)
    private Integer bunkerCapacity;

    @Column(name = "room_id", nullable = false)
    private Integer roomId;

    @Column(name = "items", length = 45)
    private String items;

    @Column(name = "bunker_area", nullable = false, length = 45)
    private String bunkerArea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBunkerCapacity() {
        return bunkerCapacity;
    }

    public void setBunkerCapacity(Integer bunkerCapacity) {
        this.bunkerCapacity = bunkerCapacity;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getBunkerArea() {
        return bunkerArea;
    }

    public void setBunkerArea(String bunkerArea) {
        this.bunkerArea = bunkerArea;
    }

}