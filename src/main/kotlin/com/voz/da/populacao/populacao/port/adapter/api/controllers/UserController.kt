package com.voz.da.populacao.populacao.port.adapter.api.controllers

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import com.voz.da.populacao.populacao.core.domain.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
    @PostMapping("/save")
    fun save(@RequestBody userModel: UserModel): UserModel {
        return userService.save(userModel)
    }
}
