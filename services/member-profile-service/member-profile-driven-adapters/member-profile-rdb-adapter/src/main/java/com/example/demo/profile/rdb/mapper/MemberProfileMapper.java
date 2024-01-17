package com.example.demo.profile.rdb.mapper;

import com.example.demo.profile.domain.MemberProfile;
import com.example.demo.profile.rdb.entity.MemberProfileEntity;
import org.mapstruct.Mapper;

@Mapper
public interface MemberProfileMapper {
    MemberProfile toDomain(MemberProfileEntity memberProfileEntity);
    MemberProfileEntity toEntity(MemberProfile memberProfile);
}
