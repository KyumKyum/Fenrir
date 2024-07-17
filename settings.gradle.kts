rootProject.name = "bifrost"

// Include modules
listOf(
    "server",
    "client",
    "utils",
    "core"
).forEach{
    include(it)
    project(":$it").projectDir = File("$rootDir/$it")
}
