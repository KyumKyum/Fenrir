import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions

plugins {
    kotlin("jvm") version "1.8.21"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.21" apply false
    id("io.ktor.plugin") version "2.3.12" apply false
}

allprojects {
    group = "com.fenrir"
    version = "1.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("ch.qos.logback:logback-classic:1.4.4")
        implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.12")
        implementation("io.ktor:ktor-serialization-jackson:2.3.12")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    }
}
