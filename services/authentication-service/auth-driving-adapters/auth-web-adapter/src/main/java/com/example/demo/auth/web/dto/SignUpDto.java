package com.example.demo.auth.web.dto;

import com.example.auth.domain.types.AccountStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

public record SignUpDto() {
    @Builder
    public record SignUpRequestDto(
            @NotBlank
            String username,
            @NotBlank
            String password,
            @NotBlank
            String nickname

    ) {}

    @Builder
    public record SignUpResponseDto(
            Boolean success
    ) {}
}
