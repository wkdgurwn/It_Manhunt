package com.seoulit.it_manhunt.dto;

import com.seoulit.it_manhunt.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseDto {

    private String username;
    private String qrCodeUrl;
    private float latitude;
    private float longitude;

    public UserResponseDto(User user) {
        this.username = user.getUsername();
        this.qrCodeUrl = user.getQrCodeUrl();
        this.latitude = user.getLatitude();
        this.longitude = user.getLongitude();
    }

}
