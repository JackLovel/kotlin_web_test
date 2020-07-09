package com.example.demo.repo

import com.example.demo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface UserRepo : JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}