package com.example.common.support.exception.response;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record ApiSimpleError(@NonNull String field, @NonNull String message) {}