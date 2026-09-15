package com.seoulit.it_manhunt.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponse {

    private int id;
    private String username;
    private String qrCodeUrl;
    private float latitude;
    private float longitude;

}
