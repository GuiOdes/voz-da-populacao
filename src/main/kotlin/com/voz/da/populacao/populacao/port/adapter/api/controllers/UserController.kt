package com.voz.da.populacao.populacao.port.adapter.api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello, world!"
    }
}
