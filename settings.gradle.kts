rootProject.name = "fenrir"

// Include modules
listOf(
    "server",
    "client",
    "utils"
).forEach{
    include(it)
    project(":$it").projectDir = File("$rootDir/$it")
}
