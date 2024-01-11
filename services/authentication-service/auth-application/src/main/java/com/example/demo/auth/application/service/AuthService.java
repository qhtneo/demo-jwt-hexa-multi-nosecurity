package com.example.demo.auth.application.service;

import com.example.auth.domain.Account;
import com.example.demo.auth.application.repository.AccountCommandRepository;
import com.example.demo.auth.application.usecase.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements SignUpUseCase {
    private final AccountCommandRepository accountCommandRepository;

    @Override
    public Account signUp(Account account) {
        return accountCommandRepository.save(account);
    }
}
