package com.example.demo.profile.internal.controller;

import com.example.demo.profile.client.api.dto.MemberProfileSaveDto.MemberProfileSaveRequestDto;
import com.example.demo.profile.client.api.dto.MemberProfileSaveDto.MemberProfileSaveResponseDto;
import com.example.demo.profile.internal.service.MemberProfileSaveProxy;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("profiles")
public final class MemberProfileInternalApi {
    private final MemberProfileSaveProxy saveProxy;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public MemberProfileSaveResponseDto save(@RequestBody @Valid MemberProfileSaveRequestDto body) {
        saveProxy.save(body);

        return MemberProfileSaveResponseDto.builder()
                .success(true)
                .build();
    }
}
