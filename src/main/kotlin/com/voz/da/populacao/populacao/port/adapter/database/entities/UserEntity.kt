package com.voz.da.populacao.populacao.port.adapter.database.entities

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.OneToMany
import javax.persistence.Table
import javax.validation.constraints.Email

@Entity
@Table(name = "tb_user")
class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column(name = "name")
    var name: String,

    @Column(name = "birth_date")
    var birthDate: LocalDate,

    @Column(name = "cpf")
    var cpf: String,

    @Column(name = "rg")
    var rg: String,

    @Column(name = "email")
    @Email
    var email: String,

    @Column(name = "profile_photo_reference")
    var profilePhoto: String,

    @ManyToMany
    val roles: Set<RoleEntity>,

    @OneToMany(mappedBy = "userOwner")
    var addresses: Set<AddressEntity>,

    @ManyToMany(mappedBy = "usersVoted")
    var postsVoted: Set<PostEntity>
)