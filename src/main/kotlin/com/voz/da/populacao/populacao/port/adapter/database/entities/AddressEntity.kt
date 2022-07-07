package com.voz.da.populacao.populacao.port.adapter.database.entities

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tb_address")
class AddressEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,

    @Column(name = "address")
    var address: String,

    @ManyToOne
    @JoinColumn(name = "city_id")
    var city: CityEntity,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var userOwner: UserEntity
)