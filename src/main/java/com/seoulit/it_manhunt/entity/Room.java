package com.seoulit.it_manhunt.entity;


import com.seoulit.it_manhunt.dto.RoomResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;

    @Column(nullable = false)
    private String roomName;

    @Column(nullable = false)
    private int maxJoin;

    @Column(nullable = false)
    private int currentJoin;

    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus = RoomStatus.WAITING;

    public Room(String roomName, int maxJoin, int currentJoin) {
        this.roomName = roomName;
        this.maxJoin = maxJoin;
        this.currentJoin = currentJoin;
    }

    public void updateRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
