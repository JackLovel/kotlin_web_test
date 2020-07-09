package com.example.demo.service

import com.example.demo.model.User
import com.example.demo.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    @Autowired
    private val userRepo: UserRepo? = null

    override fun save(user: User) {
        userRepo?.save(user)
    }
}