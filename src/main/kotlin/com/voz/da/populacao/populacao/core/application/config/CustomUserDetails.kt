package com.voz.da.populacao.populacao.core.application.config

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class CustomUserDetails(
    private val user: UserModel?
): UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return mutableListOf()
    }

    override fun getPassword(): String {
        return user?.password ?: throw NullPointerException("User doesn't be null!")
    }

    override fun getUsername(): String {
        return user?.email ?: throw NullPointerException("User doesn't be null!")
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}