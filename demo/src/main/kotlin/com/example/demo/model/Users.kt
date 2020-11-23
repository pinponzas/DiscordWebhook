package com.example.demo.model

import lombok.Data
import javax.persistence.*


@Entity
@Table(name = "Users")
open class Users (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,

        var name: String
)
