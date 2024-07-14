rootProject.name = "fenrir"

// Include modules
listOf(
    "server",
    "client",
).forEach{
    include(it)
}
