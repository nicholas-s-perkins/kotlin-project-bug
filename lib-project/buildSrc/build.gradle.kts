// https://docs.gradle.org/current/userguide/kotlin_dsl.html#sec:kotlin-dsl_plugin
plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

// if this is highlighted red it is not a real error
kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
