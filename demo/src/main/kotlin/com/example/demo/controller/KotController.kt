package com.example.demo.controller

import com.example.demo.Service.KotService
import com.example.demo.model.Users

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class KotController{

    @Autowired
    lateinit var service : KotService

    @GetMapping("/plus")
    fun calculatePlus (@RequestParam num1 : Int,num2 : Int) : Int  {
        val sum = num1 + num2
        return sum
    }

    @PostMapping("/addUser")
    fun addUser (@RequestParam name : String) : Boolean  {
        val user : Users

        service.addUser(name)
        return true
    }




}