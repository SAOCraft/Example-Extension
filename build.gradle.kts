import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
}

group = "net.swordcraft"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
        implementation("com.github.SAOCraft:Tachyon:f02b734c6b")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
}