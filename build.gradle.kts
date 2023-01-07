plugins {
    kotlin("jvm") version "1.7.21"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "net.swordcraft"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.SAOCraft:Tachyon:-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
}