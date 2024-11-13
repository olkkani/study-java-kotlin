import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    kotlin("jvm") version "2.0.21"
    kotlin("plugin.serialization") version "2.0.21"
    id("io.freefair.lombok") version "8.4"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

group = "io.olkkani"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}
val ktorVersion="3.0.0"
dependencies {
    // kotlin 필수 의존성
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // logging
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.apache.logging.log4j:log4j-core:2.24.1")
    implementation("org.apache.logging.log4j:log4j-api:2.24.1")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.24.1")
//    testImplementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.24.1")
    implementation("org.slf4j:slf4j-simple:2.0.16")
    implementation("io.ktor:ktor-client-logging:3.0.0")

    runtimeOnly("org.apache.logging.log4j:log4j-api-kotlin:1.5.0")


    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.4")
    implementation("org.yaml:snakeyaml:1.33")

    // api
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.1")


}


kotlin {
    jvmToolchain(21)
}

application {
    // Define the main class for the application.
    mainClass.set("io.olkkani.AppKt")
}

