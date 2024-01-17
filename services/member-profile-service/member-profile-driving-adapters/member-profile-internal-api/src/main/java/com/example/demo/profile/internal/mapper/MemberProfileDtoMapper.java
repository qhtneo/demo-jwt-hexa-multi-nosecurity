package com.example.demo.profile.internal.mapper;

import com.example.demo.profile.client.api.dto.MemberProfileSaveDto.MemberProfileSaveRequestDto;
import com.example.demo.profile.domain.MemberProfile;
import org.mapstruct.Mapper;

@Mapper
public interface MemberProfileDtoMapper {
    MemberProfile toDomain(MemberProfileSaveRequestDto memberProfileSaveRequestDto);
}
