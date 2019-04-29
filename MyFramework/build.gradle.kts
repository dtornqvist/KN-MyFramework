plugins {
    kotlin("multiplatform") version "1.3.30"
    kotlin("xcode-compat") version "0.1"
}

repositories {
    mavenCentral()
}

kotlin {
    xcode {
        setupFramework("MyFramework")
    }
}