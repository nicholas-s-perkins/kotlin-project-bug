import com.nsperkins.kotlin.Versions

plugins {
    `java-library`
    kotlin("jvm") version "1.3.41"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api(group = "org.apache.commons", name = "commons-lang3", version = Versions.commonsLang)

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter", version = Versions.junit)
}
