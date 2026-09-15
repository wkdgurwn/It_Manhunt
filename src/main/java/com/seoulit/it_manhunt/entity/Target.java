package com.seoulit.it_manhunt.entity;

import com.seoulit.it_manhunt.dto.TargetResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Getter
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hunterId")
    private User hunterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tagetId")
    private User targetId;

    @Enumerated(EnumType.STRING)
    private TargetStatus targetStatus = TargetStatus.RUNNING;

    @Column(nullable = false)
    private LocalDateTime caughtWhen;

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

    public void updateTargetStatus(TargetStatus targetStatus, LocalTime caughtWhen) {
        this.targetStatus = targetStatus;

        if (targetStatus == TargetStatus.CAUGHT) {
            this.caughtWhen = LocalDateTime.now();
        }
    }
}
