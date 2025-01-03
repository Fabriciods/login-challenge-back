import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userName: String,
    val login: String,
    val password: String
)