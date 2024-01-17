package com.example.demo.profile.internal.service;

import com.example.demo.profile.client.api.dto.MemberProfileSaveDto.MemberProfileSaveRequestDto;
import com.example.demo.profile.domain.MemberProfile;

public interface MemberProfileSaveProxy {
    // Res -> domain
    // Req -> DTO
    MemberProfile save(MemberProfileSaveRequestDto memberProfileSaveRequestDto);
}
