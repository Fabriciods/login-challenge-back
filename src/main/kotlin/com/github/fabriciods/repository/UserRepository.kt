package com.github.fabriciods.repository

import User
import kotlin.math.log

class UserRepository {

    val users get() = _users.toList()

    companion object {
        private val _users = mutableListOf(
            User(
                userName = "Administrator",
                login = "admin",
                password = "admin"
            ),
            User(
                userName = "Bob",
                login = "bob",
                password = "123456"
            ),
            User(
                userName = "Emily",
                login = "emily",
                password = "654321"
            ),
            User(
                userName = "Arthur",
                login = "arthur",
                password = "102030"
            )
            )
    }
}