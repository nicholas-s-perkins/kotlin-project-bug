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

//val sourcesJar by tasks.registering(Jar::class){
//    from(sourceSets.main.get().allSource)
//    archiveClassifier.set("sources")
//}
//
//val javadocJar by tasks.registering(Jar::class){
//    from(tasks.javadoc)
//    archiveClassifier.set("javadoc")
//}
//
//publishing {
//    publications {
//        create<MavenPublication>("mavenJava") {
//            from(components["java"])
//            artifact(sourcesJar.get())
//            artifact(javadocJar.get())
//            pom {
//                name.set("my-lib")
//                description.set("a test lib")
//            }
//        }
//    }
//}
