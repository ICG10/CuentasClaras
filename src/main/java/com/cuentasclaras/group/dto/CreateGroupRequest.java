package com.cuentasclaras.group.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateGroupRequest(
        @NotBlank @Size(max = 100) String name,
        @NotNull Long createdByUserId // provisional: from the JWT in phase 3
) {
}