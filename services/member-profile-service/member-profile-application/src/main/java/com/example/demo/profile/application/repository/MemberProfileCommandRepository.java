package com.example.demo.profile.application.repository;

import com.example.demo.profile.domain.MemberProfile;

public interface MemberProfileCommandRepository {
    MemberProfile save(MemberProfile memberProfile);
}
