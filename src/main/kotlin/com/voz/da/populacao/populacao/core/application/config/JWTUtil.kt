package com.voz.da.populacao.populacao.core.application.config

import org.keycloak.adapters.OidcKeycloakAccount
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class JWTUtil {

    fun getAuthenticationToken(): KeycloakAuthenticationToken {
        val context = SecurityContextHolder.getContext()
        return context.authentication as KeycloakAuthenticationToken
    }

    fun getUserClaim(): String {
        val authenticationToken = getAuthenticationToken()
        val account: OidcKeycloakAccount = authenticationToken.account
        return account.keycloakSecurityContext.token.subject
    }

    fun getPartnerClaim(): String {
        val authenticationToken = getAuthenticationToken()
        val account: OidcKeycloakAccount = authenticationToken.account
        val tokenClaims = account.keycloakSecurityContext.token.otherClaims
        return tokenClaims.get(key = PARTNER).toString()
    }

    companion object {
        const val PARTNER = "partner"
    }
}