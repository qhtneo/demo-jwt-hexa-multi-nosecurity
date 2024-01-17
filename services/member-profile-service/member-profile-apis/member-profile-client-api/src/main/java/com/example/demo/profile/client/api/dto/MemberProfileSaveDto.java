package com.example.demo.profile.client.api.dto;

import com.example.demo.profile.domain.types.AccountStatus;
import com.example.demo.profile.domain.types.Gender;
import lombok.Builder;

import java.time.Instant;

public final class MemberProfileSaveDto {
    private MemberProfileSaveDto() {}

    @Builder
    public record MemberProfileSaveRequestDto(
            // TODO Validation Annotation
            String accountId,
            String username,
            String nickname,
            Gender gender,
            String fullName,
            String email,
            AccountStatus status,
            Instant createdAt,
            Instant updatedAt
    ) {
        public MemberProfileSaveRequestDto {
            if (createdAt == null) {
                createdAt = Instant.now();
            }
        }
    }

    @Builder
    public record MemberProfileSaveResponseDto(
            Boolean success
    ) {}
}
