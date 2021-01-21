plugins {
    kotlin("jvm") version "1.4.21"
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.jetbrains.kotlin.plugin.spring") version "1.4.21"
}

java.sourceCompatibility = JavaVersion.VERSION_1_8

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
group = "io.github.murphp15"
version = "1.0.0"


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("org.springframework.boot:spring-boot-starter-web")
    api("de.codecentric:spring-boot-admin-starter-server:2.3.1")
}