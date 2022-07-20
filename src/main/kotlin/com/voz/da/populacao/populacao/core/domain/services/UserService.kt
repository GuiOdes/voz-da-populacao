package com.voz.da.populacao.populacao.core.domain.services

import com.voz.da.populacao.populacao.core.domain.models.UserModel

interface UserService {
    fun save(userModel: UserModel): UserModel
}