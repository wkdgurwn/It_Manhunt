package com.seoulit.it_manhunt.dto;

import com.seoulit.it_manhunt.entity.TargetStatus;
import com.seoulit.it_manhunt.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Getter
@NoArgsConstructor
public class TargetResponse {

    private User hunterId;
    private User tagetId;
    private TargetStatus targetStatus;
    private LocalTime caughtWhen;
    private float targetLatitude;
    private float targetLongitude;

}
