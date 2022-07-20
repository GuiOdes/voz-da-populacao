package com.voz.da.populacao.populacao.core.application.config

import com.voz.da.populacao.populacao.core.domain.repositories.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component

@Component
class CustomUserDetailsService(
    private val userRepository: UserRepository
): UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        val user = userRepository.findByEmail(username!!) ?: throw NullPointerException("User not found")

        return CustomUserDetails(user)
    }
}
