package com.lesnoy.oidcservice.auth.google;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;

@AllArgsConstructor
public class CustomerOAuthUser implements OAuth2User {

    private OAuth2User user;

    @Override
    public Map<String, Object> getAttributes() {
        return user.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }

    @Override
    public String getName() {
        return user.getName();
    }

    public String getUsername() {
        return user.getAttribute("name");
    }
}
