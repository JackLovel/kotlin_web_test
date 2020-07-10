package com.example.demo.service

import com.example.demo.model.User
import com.example.demo.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    @Autowired
    private val userRepo: UserRepo? = null

    override fun save(user: User) {
        userRepo?.save(user)
    }

    override fun getAllUser(pageable: Pageable): MutableList<User>? {
        return userRepo?.findAll()
    }

    override fun findById(userId: Long): User? {
        return userRepo?.getOne(userId)
    }

    override fun deleteById(userId: Long) {
        userRepo?.deleteById(userId)
    }
}