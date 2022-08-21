package com.voz.da.populacao.populacao.core.domain.models

import com.voz.da.populacao.populacao.port.adapter.database.entities.AddressEntity
import com.voz.da.populacao.populacao.port.adapter.database.entities.PostEntity
import com.voz.da.populacao.populacao.port.adapter.database.entities.RoleEntity
import java.time.LocalDate
import java.util.UUID

class UserModel(
    val id: UUID? = null,
    var name: String,
    var birthDate: LocalDate,
    var cpf: String,
    var rg: String,
    var email: String,
    var profilePhoto: String? = null,
    var password: String,
    var userRoles: Set<RoleEntity>? = null,
    var addresses: Set<AddressEntity>? = null,
    var postsVoted: Set<PostEntity>? = null
)