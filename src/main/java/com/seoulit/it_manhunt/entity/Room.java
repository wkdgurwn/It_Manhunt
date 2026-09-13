package com.seoulit.it_manhunt.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String roomName;

    @Column(nullable = false)
    private final int maxJoin = 10;

    @Column(nullable = false)
    private int currentJoin = 0;

    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus = RoomStatus.WAITING;

    public Room(int id, String roomName) {
        this.id = id;
        this.roomName = roomName;
    }

    public void UpdateJoin(int currentJoin) {
        this.currentJoin++;
    }

    public void UpdateRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
