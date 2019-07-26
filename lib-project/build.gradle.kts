import com.nsperkins.kotlin.Versions

plugins {
    java
    kotlin("jvm") version "1.3.41"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(group = "commons-io", name = "commons-io", version = Versions.commonsIo)
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter", version = Versions.junit)
}
