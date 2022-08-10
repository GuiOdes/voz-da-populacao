package com.voz.da.populacao.populacao.port.adapter.database.entities

import com.voz.da.populacao.populacao.core.domain.models.UserModel
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
    var profilePhoto: String?,

    @Column(name = "password")
    var password: String,

    @ManyToMany
    val userRoles: Set<RoleEntity>?,

    @OneToMany(mappedBy = "userOwner")
    var addresses: Set<AddressEntity>?,

    @ManyToMany(mappedBy = "usersVoted")
    var postsVoted: Set<PostEntity>?
) {

    fun toUserModel(): UserModel {
        return UserModel(
            id = this.id,
            name = this.name,
            birthDate = this.birthDate,
            cpf = this.cpf,
            rg = this.rg,
            email = this.email,
            profilePhoto = this.profilePhoto,
            password = this.password,
            userRoles = this.userRoles,
            addresses = this.addresses,
            postsVoted = this.postsVoted
        )
    }

    companion object {
        fun of(userModel: UserModel): UserEntity {
            return UserEntity(
                id = userModel.id,
                name = userModel.name,
                birthDate = userModel.birthDate,
                cpf = userModel.cpf,
                rg = userModel.rg,
                email = userModel.email,
                profilePhoto = userModel.profilePhoto,
                password = userModel.password,
                userRoles = userModel.userRoles,
                addresses = userModel.addresses,
                postsVoted = userModel.postsVoted
            )
        }
    }
}
