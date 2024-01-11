package com.example.demo.auth.rdb.mapper;

import com.example.auth.domain.Account;
import com.example.demo.auth.rdb.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {
    Account toDomain(AccountEntity entity);
    AccountEntity toEntity(Account domain);
}
