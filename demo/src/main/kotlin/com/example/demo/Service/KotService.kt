package com.example.demo.Service

import com.example.demo.Repository.KotRepository
import com.example.demo.model.Users
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class KotService{
    @Autowired
    private val kotRepository: KotRepository? = null

    fun addUser(name: String?) {
        var users = Users(1,""+name)
        kotRepository?.save(users)
    }
}