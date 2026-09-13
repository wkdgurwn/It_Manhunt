package com.seoulit.it_manhunt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Getter
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hunterId")
    private User hunterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tagetId")
    private User targetId;

    @Enumerated(EnumType.STRING)
    private TargetStatus targetStatus = TargetStatus.RUNNING;

    @Column(nullable = false)
    private LocalTime caughtWhen;

    @Column(nullable = false)
    private float targetLatitude;

    @Column(nullable = false)
    private float targetLongitude;

    public Target(User hunterId, User targetId, float targetLatitude, float targetLongitude) {
        this.hunterId = hunterId;
        this.targetId = targetId;
        this.targetLatitude = targetLatitude;
        this.targetLongitude = targetLongitude;
    }

    public void UpdateTargetStatus(TargetStatus targetStatus, LocalTime caughtWhen) {
        this.caughtWhen = caughtWhen;
        this.targetStatus = targetStatus;
    }
}
