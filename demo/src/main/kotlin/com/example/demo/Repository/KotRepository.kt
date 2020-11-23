package com.example.demo.Repository

import com.example.demo.model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface KotRepository : JpaRepository<Users?, Long?>{

}