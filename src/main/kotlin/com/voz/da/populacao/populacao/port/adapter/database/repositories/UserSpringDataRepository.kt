package com.voz.da.populacao.populacao.port.adapter.database.repositories

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import com.voz.da.populacao.populacao.port.adapter.database.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserSpringDataRepository: JpaRepository<UserEntity, UUID> {
    fun findByEmail(email: String): UserEntity?
}