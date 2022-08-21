package com.voz.da.populacao.populacao.port.adapter.database.entities

import com.voz.da.populacao.populacao.core.domain.enums.PostClassification
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "tb_post")
class PostEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,

    @Column(name = "description")
    var description: String,

    @Column(name = "creation_date")
    var creationDate: LocalDateTime,

    @Column(name = "update_date")
    var updateDate: LocalDateTime,

    @Enumerated(EnumType.STRING)
    @Column(name = "classification_type")
    var classification: PostClassification,

    @ManyToMany(mappedBy = "postsVoted")
    var usersVoted: Set<UserEntity>
)