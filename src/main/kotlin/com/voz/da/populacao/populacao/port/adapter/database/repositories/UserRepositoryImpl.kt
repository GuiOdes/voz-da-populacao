package com.voz.da.populacao.populacao.port.adapter.database.repositories

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import com.voz.da.populacao.populacao.core.domain.repositories.UserRepository
import com.voz.da.populacao.populacao.port.adapter.database.entities.UserEntity
import org.springframework.stereotype.Component

@Component
class UserRepositoryImpl(
    private val springDataRepository: UserSpringDataRepository
): UserRepository {
    override fun save(userModel: UserModel): UserModel {
        return springDataRepository.save(UserEntity.of(userModel)).toUserModel()
    }

    override fun findByEmail(email: String): UserModel? {
        return springDataRepository.findByEmail(email)?.toUserModel()
    }
}
