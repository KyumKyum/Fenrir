import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
    id("org.springframework.boot") version "2.6.4" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//subprojects {
//    apply(plugin = "kotlin")
//    apply(plugin = "io.spring.dependency-management")
//
//    dependencies {
//        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    }
//
//    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//        kotlinOptions {
//            freeCompilerArgs = listOf("-Xjsr305=strict")
//            jvmTarget = "22"
//        }
//    }
//
//    tasks.withType<JavaCompile> {
//        options.release.set(22)
//    }
//}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "22"
}

//application {
//    mainClass.set("MainKt")
//}