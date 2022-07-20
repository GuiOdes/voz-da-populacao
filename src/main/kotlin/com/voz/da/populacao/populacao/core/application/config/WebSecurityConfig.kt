package com.voz.da.populacao.populacao.core.application.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService

@Configuration
@EnableConfigurationProperties
class WebSecurityConfig(
    private val userDetailsService: UserDetailsService
): WebSecurityConfigurerAdapter() {


}