package com.voz.da.populacao.populacao.port.adapter.api.controllers

import com.voz.da.populacao.populacao.core.application.config.JWTUtil
import com.voz.da.populacao.populacao.core.domain.models.UserModel
import com.voz.da.populacao.populacao.core.domain.services.UserService
import com.voz.da.populacao.populacao.port.adapter.database.entities.UserEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    private val jwtUtil: JWTUtil,
    private val userService: UserService
) {

    @GetMapping("/hello")
    fun helloWorld(@RequestHeader("Authorization") userToken: String): Any? {
        return jwtUtil.getUserClaim()
    }

    @PostMapping("/save")
    fun save(@RequestBody userModel: UserModel): UserModel {
        return userService.save(userModel)
    }
}
