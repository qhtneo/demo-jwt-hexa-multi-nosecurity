package com.example.demo.profile.internal.service;

import com.example.demo.profile.application.usecase.MemberProfileSaveUseCase;
import com.example.demo.profile.client.api.dto.MemberProfileSaveDto.MemberProfileSaveRequestDto;
import com.example.demo.profile.domain.MemberProfile;
import com.example.demo.profile.internal.mapper.MemberProfileDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class MemberProfileProxyService implements MemberProfileSaveProxy {

    private final MemberProfileDtoMapper mapper;
    private final MemberProfileSaveUseCase memberProfileSaveUseCase;

    @Override
    public MemberProfile save(MemberProfileSaveRequestDto memberProfileSaveRequestDto) {
        MemberProfile memberProfile = mapper.toDomain(memberProfileSaveRequestDto);
        return memberProfileSaveUseCase.save(memberProfile);
    }
}
