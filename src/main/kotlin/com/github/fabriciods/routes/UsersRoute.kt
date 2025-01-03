import com.github.fabriciods.models.LoginRequest
import com.github.fabriciods.models.LoginResponse
import com.github.fabriciods.repository.UserRepository
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*

import io.ktor.server.routing.*

fun Route.getUsers(repository: UserRepository) {
    get("/users") {
        call.respond(
            HttpStatusCode.OK,
            repository.users
        )
    }
}

fun Route.login(repository: UserRepository) {
    post("/login") {
        val loginRequest = call.receive<LoginRequest>()
        val user = repository.users.find {
            it.login.lowercase() == loginRequest.login.lowercase()
                    && it.password.lowercase() == loginRequest.password.lowercase()
        }
        if (user != null) {
            call.respond(
                HttpStatusCode.OK,
                LoginResponse(user.userName)
            )
        } else {
            call.respond(HttpStatusCode.Unauthorized)
        }
    }

}