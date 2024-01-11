package com.example.demo.auth.web;

import com.example.demo.auth.web.dto.SignUpDto.SignUpRequestDto;
import com.example.demo.auth.web.dto.SignUpDto.SignUpResponseDto;
import com.example.demo.auth.web.service.SignUpProxyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("Account")
public class AccountCommandApi {
    private final SignUpProxyService signUpProxyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SignUpResponseDto signUp(@RequestBody @Valid SignUpRequestDto body) {
        return signUpProxyService.SignUp(body);
    }
}
