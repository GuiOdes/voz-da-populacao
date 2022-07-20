package com.voz.da.populacao.populacao.core.domain.models

import com.voz.da.populacao.populacao.port.adapter.database.entities.AddressEntity
import com.voz.da.populacao.populacao.port.adapter.database.entities.PostEntity
import com.voz.da.populacao.populacao.port.adapter.database.entities.RoleEntity
import java.time.LocalDate

class UserModel(
    val id: Long?,
    var name: String,
    var birthDate: LocalDate,
    var cpf: String,
    var rg: String,
    var email: String,
    var profilePhoto: String,
    var password: String,
    var userRoles: Set<RoleEntity>?,
    var addresses: Set<AddressEntity>?,
    var postsVoted: Set<PostEntity>?
)