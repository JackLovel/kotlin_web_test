package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
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

    @GetMapping("/all")
    fun getAllUser(): MutableList<User>? {
        return userService?.getAllUser()
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable("id") id: Long): User? {
        return userService?.findById(id)
    }

    @GetMapping("/delete/{id}")
    fun deleteUser(@PathVariable("id") id: Long) {
        userService?.deleteById(id)
    }
}