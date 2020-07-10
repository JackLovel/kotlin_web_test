package com.example.demo.service

import com.example.demo.model.User
import org.springframework.data.domain.Pageable

interface UserService {
    fun save(user: User)
    fun getAllUser(pageable: Pageable): MutableList<User>?
    fun findById(userId: Long) : User?
    fun deleteById(userId: Long)
}