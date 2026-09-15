package com.seoulit.it_manhunt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @Column(nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 20)
    private String qrCodeUrl;

    @Column(nullable = false)
    private float latitude;

    @Column(nullable = false)
    private float longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "joinRoom")
    private Room joinRoom;

    @Column(nullable = false)
    private int life;

    public User(String username, String qrCodeUrl) {
        this.username = username;
        this.qrCodeUrl = qrCodeUrl;
    }

    public void updateLocation(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
