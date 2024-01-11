package com.example.demo.auth.rdb.repository;

import com.example.auth.domain.Account;
import com.example.demo.auth.application.repository.AccountCommandRepository;
import com.example.demo.auth.rdb.entity.AccountEntity;
import com.example.demo.auth.rdb.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccountPersistence implements AccountCommandRepository {
    private final AccountJpaRepository accountJpaRepository;
    private final AccountMapper mapper;

    @Override
    public Account save(Account account) {
        AccountEntity entity = mapper.toEntity(account);
        AccountEntity savedEntity = accountJpaRepository.save(entity);

        return mapper.toDomain(savedEntity);
    }

}
