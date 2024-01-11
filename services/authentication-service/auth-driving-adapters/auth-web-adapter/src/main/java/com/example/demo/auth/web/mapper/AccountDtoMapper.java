package com.example.demo.auth.web.mapper;

import com.example.auth.domain.Account;
import com.example.auth.domain.types.AccountStatus;
import com.example.demo.auth.web.dto.SignUpDto.SignUpRequestDto;
import org.mapstruct.Mapper;

import java.time.Instant;

@Mapper
public interface AccountDtoMapper {
    Account from(SignUpRequestDto dto, AccountStatus status, Instant createdAt);
}
