description = "server module"

plugins {
    kotlin("jvm") version "1.8.21"
    application
}

application {
    mainClass.set("com.fenrir.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":utils"))
    implementation("io.ktor:ktor-server-cors-jvm:2.3.12")
    implementation("io.ktor:ktor-server-compression-jvm:2.3.12")
    implementation("io.ktor:ktor-server-caching-headers-jvm:2.3.12")
    implementation("io.ktor:ktor-server-default-headers-jvm:2.3.12")
    implementation("io.ktor:ktor-server-conditional-headers-jvm:2.3.12")
    implementation("io.ktor:ktor-server-core-jvm:2.3.12")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:2.3.12")
    implementation("io.ktor:ktor-server-call-logging-jvm:2.3.12")
    implementation("com.ucasoft.ktor:ktor-simple-cache-jvm:0.3.1")
    implementation("com.ucasoft.ktor:ktor-simple-memory-cache-jvm:0.3.1")
    implementation("io.github.flaxoos:ktor-server-kafka-jvm:1.2.9")
    implementation("io.ktor:ktor-server-netty-jvm:2.3.12")
    testImplementation("io.ktor:ktor-server-tests-jvm:2.3.12")
}

tasks.test {}
