package com.seoulit.it_manhunt.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UserRequestDto {

    @NotBlank(message = "닉네임을 작성해주세요")
    private String username;

}
