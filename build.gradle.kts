import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0" apply false
    id("io.ktor.plugin") version "2.3.12" apply false
}

allprojects {
    group = "com.fenrir"
    version = "1.0"

    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile> {
        options.release.set(22)
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "22"
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("ch.qos.logback:logback-classic:1.4.4")
        implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
        implementation("io.ktor:ktor-serialization-jackson-jvm")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit:2.0.0")
    }

    tasks.test {
        useJUnitPlatform()
    }
}

//dependencies {
//    testImplementation(kotlin("test"))
//}
//


//application {
//    mainClass.set("MainKt")
//}
