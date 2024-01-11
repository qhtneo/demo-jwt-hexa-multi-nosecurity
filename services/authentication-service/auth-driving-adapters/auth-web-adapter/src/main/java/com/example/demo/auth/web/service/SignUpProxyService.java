package com.example.demo.auth.web.service;

import com.example.auth.domain.Account;
import com.example.auth.domain.types.AccountStatus;
import com.example.demo.auth.application.usecase.SignUpUseCase;
import com.example.demo.auth.web.dto.SignUpDto.SignUpRequestDto;
import com.example.demo.auth.web.dto.SignUpDto.SignUpResponseDto;
import com.example.demo.auth.web.mapper.AccountDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
@RequiredArgsConstructor
public class SignUpProxyService {
    private final SignUpUseCase signUpUseCase;
    private final AccountDtoMapper mapper;

    public SignUpResponseDto SignUp(SignUpRequestDto dto) {
        Account account = mapper.from(dto, AccountStatus.ACTIVE, Instant.now());
        signUpUseCase.signUp(account);

        return SignUpResponseDto.builder()
                .success(true)
                .build();
    }
}
