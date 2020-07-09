package com.example.demo.service

import com.example.demo.model.User

interface UserService {
    fun save(user: User)
}