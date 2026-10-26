package com.cuentasclaras.group.dto;

import com.cuentasclaras.group.domain.ExpenseGroup;

import java.time.Instant;

public record GroupResponse(Long id, String name, String currency, Long createdBy, Instant createdAt) {

    public static GroupResponse from(ExpenseGroup group) {
        return new GroupResponse(group.getId(), group.getName(), group.getCurrency(),
                group.getCreatedBy(), group.getCreatedAt());
    }
}