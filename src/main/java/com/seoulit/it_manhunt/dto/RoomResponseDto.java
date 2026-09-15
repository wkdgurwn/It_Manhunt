package com.seoulit.it_manhunt.dto;

import com.seoulit.it_manhunt.entity.Room;
import com.seoulit.it_manhunt.entity.RoomStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RoomResponseDto {

    private String roomName;
    private int currentJoin;
    private int maxJoin;
    private RoomStatus roomStatus;

    public RoomResponseDto(Room room) {
        this.roomName = room.getRoomName();
        this.currentJoin = room.getCurrentJoin();
        this.maxJoin = room.getMaxJoin();
        this.roomStatus = room.getRoomStatus();
    }
}
