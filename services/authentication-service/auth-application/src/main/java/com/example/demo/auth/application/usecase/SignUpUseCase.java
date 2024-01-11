package com.example.demo.auth.application.usecase;

import com.example.auth.domain.Account;

public interface SignUpUseCase {
    Account signUp(Account account);
}
