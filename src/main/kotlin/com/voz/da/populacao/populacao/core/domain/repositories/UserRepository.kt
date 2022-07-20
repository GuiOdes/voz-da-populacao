package com.voz.da.populacao.populacao.core.domain.repositories

import com.voz.da.populacao.populacao.core.domain.models.UserModel

interface UserRepository {
    fun save(userModel: UserModel): UserModel
    fun findByEmail(email: String): UserModel?
}