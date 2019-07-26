import com.nsperkins.kotlin.Versions

plugins {
    java
    kotlin("jvm") version "1.3.41"
}

repositories {
    mavenCentral()
}

group = "com.nsperkins"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(group = "org.apache.commons", name = "commons-lang3", version = Versions.commonsLang)

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter", version = Versions.junit)
}
