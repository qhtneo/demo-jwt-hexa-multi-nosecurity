package com.example.demo.profile.application.service;

import com.example.demo.profile.application.repository.MemberProfileCommandRepository;
import com.example.demo.profile.application.usecase.MemberProfileSaveUseCase;
import com.example.demo.profile.domain.MemberProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class MemberProfileService implements MemberProfileSaveUseCase {
    private final MemberProfileCommandRepository memberProfileCommandRepository;
    @Override
    public MemberProfile save(MemberProfile memberProfile) {
        // TODO exists -> Duplicate
        return memberProfileCommandRepository.save(memberProfile);
    }
}
