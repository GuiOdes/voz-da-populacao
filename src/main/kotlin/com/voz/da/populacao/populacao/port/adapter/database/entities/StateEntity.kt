package com.voz.da.populacao.populacao.port.adapter.database.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "tb_state")
class StateEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column(name = "name")
    var name: String,

    @ManyToOne
    @JoinColumn(name = "country_id")
    var country: CountryEntity,

    @OneToMany(mappedBy = "state")
    var cityList: Set<CityEntity>
)