package com.springboot.todos.entity;

import jakarta.persistence.Embeddable;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

@Embeddable
public class Authority implements GrantedAuthority {

    private String authority;

    @Override
    public @Nullable String getAuthority() {
        return "";
    }
}
