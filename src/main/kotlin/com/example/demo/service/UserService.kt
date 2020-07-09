package com.example.demo.service

import com.example.demo.model.User

interface UserService {
    fun save(user: User)
    fun getAllUser() : MutableList<User>?
    fun findById(userId: Long) : User?
    fun deleteById(userId: Long)
}