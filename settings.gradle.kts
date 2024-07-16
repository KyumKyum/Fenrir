rootProject.name = "bifrost"

// Include modules
listOf(
    "server",
    "client",
    "utils"
).forEach{
    include(it)
    project(":$it").projectDir = File("$rootDir/$it")
}
