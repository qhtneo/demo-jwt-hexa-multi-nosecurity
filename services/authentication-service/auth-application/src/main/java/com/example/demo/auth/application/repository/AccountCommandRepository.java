package com.example.demo.auth.application.repository;

import com.example.auth.domain.Account;
import lombok.NonNull;

public interface AccountCommandRepository {
    Account save(@NonNull Account account);
}
