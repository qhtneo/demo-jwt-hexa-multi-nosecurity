package com.example.demo.profile.rdb.repository;

import com.example.demo.profile.application.repository.MemberProfileCommandRepository;
import com.example.demo.profile.domain.MemberProfile;
import com.example.demo.profile.rdb.entity.MemberProfileEntity;
import com.example.demo.profile.rdb.mapper.MemberProfileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository // bean 등록
@RequiredArgsConstructor
public class MemberProfilePersistence implements MemberProfileCommandRepository {

    // Delegation (위임) -- 프록시 구성
    private final MemberProfileJpaRepository memberProfileJpaRepository;
    private final MemberProfileMapper mapper;

    @Override
    public MemberProfile save(MemberProfile memberProfile) {
        MemberProfileEntity memberProfileEntity = mapper.toEntity(memberProfile);
        MemberProfileEntity savedEntity = memberProfileJpaRepository.save(memberProfileEntity);
        
        return mapper.toDomain(savedEntity);
    }
}
