package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.repo.UserRepo
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/user")
class UserController(private val userRepo: UserRepo) {

    @RequestMapping
    fun getAllUsers(@PageableDefault(sort = ["id"], direction = Sort.Direction.DESC, size = 3) pageable: Pageable): Page<User> {
        return userRepo.findAll(pageable)
    }

    @PostMapping
    fun addUser(@Valid @RequestBody user: User): User {
        return userRepo.save(user)
    }

//    @GetMapping("/all")
//    fun getAllUser(): MutableList<User>? {
//        return userService?.getAllUser(pageable)
//    }
//
//    @GetMapping("/{id}")
//    fun getUser(@PathVariable("id") id: Long): User? {
//        return userService?.findById(id)
//    }
//
//    @GetMapping("/delete/{id}")
//    fun deleteUser(@PathVariable("id") id: Long) {
//        userService?.deleteById(id)
//    }
}