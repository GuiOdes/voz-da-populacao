package com.voz.da.populacao.populacao.port.adapter.services

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import com.voz.da.populacao.populacao.core.domain.repositories.UserRepository
import com.voz.da.populacao.populacao.core.domain.services.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
): UserService {

    override fun save(userModel: UserModel): UserModel {
        return userRepository.save(userModel)
    }
}