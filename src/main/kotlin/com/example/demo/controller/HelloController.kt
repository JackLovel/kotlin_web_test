package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @Autowired
    private val userService: UserService? = null

    @RequestMapping("/")
    fun index(): User {
        var user = User()
        user.name = "Jack"
        user.password = "12121"

        userService?.save(user)
        return user
    }
}