plugins {
    val kotlinVersion = "2.2.20"
    id("com.github.ben-manes.versions") version "0.52.0"
    kotlin("jvm") version kotlinVersion
}

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(kotlin("test"))
}

