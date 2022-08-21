package com.voz.da.populacao.populacao.port.adapter.database.entities

import com.voz.da.populacao.populacao.core.domain.models.UserModel
import java.time.LocalDate
import java.util.UUID
import javax.persistence.*
import javax.validation.constraints.Email

@Entity
@Table(name = "tb_user")
class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null,

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
    var profilePhoto: String? = null,

    @Column(name = "password")
    var password: String,

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tb_user_role",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    val userRoles: Set<RoleEntity>? = null,

    @OneToMany(mappedBy = "userOwner")
    var addresses: Set<AddressEntity>? = null,

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tb_post_likes",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "post_id")]
    )
    var postsVoted: Set<PostEntity>? = null
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
