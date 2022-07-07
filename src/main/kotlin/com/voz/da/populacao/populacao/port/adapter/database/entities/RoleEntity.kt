package com.voz.da.populacao.populacao.port.adapter.database.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "tb_role")
class RoleEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column(name = "name")
    var name: String,

    @ManyToMany
    val users: Set<UserEntity>
)
