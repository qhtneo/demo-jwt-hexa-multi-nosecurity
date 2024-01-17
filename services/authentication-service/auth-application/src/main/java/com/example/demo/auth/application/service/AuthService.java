package com.example.demo.auth.application.service;

import com.example.auth.domain.Account;
import com.example.demo.auth.application.repository.AccountCommandRepository;
import com.example.demo.auth.application.usecase.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements SignUpUseCase {
    private final AccountCommandRepository accountCommandRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Account signUp(Account account) {
        account.password = passwordEncoder.encode(account.password);
        return accountCommandRepository.save(account);
    }
}
