package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "t_user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var name : String = ""
    var password : String = ""
}