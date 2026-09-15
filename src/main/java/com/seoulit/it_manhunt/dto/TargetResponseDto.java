package com.seoulit.it_manhunt.dto;

import com.seoulit.it_manhunt.entity.Target;
import com.seoulit.it_manhunt.entity.TargetStatus;
import com.seoulit.it_manhunt.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
public class TargetResponseDto {

    private User hunterId;
    private User tagetId;
    private TargetStatus targetStatus;
    private LocalDateTime caughtWhen;
    private float targetLatitude;
    private float targetLongitude;

    public TargetResponseDto (Target target) {
        this.hunterId = target.getHunterId();
        this.tagetId = target.getTargetId();
        this.targetStatus = target.getTargetStatus();
        this.caughtWhen = target.getCaughtWhen();
        this.targetLatitude = target.getTargetLatitude();
        this.targetLongitude = target.getTargetLongitude();
    }

}
