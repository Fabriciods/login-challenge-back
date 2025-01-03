package com.github.fabriciods

import com.github.fabriciods.repository.UserRepository
import getUsers
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.plugins.calllogging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import login
import org.slf4j.event.*

fun Application.configureRouting() {
    val userRepository = UserRepository()
    routing {
        getUsers(repository = userRepository)
        login(repository = userRepository)
    }
}
