plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(App.compileSdk)

    defaultConfig {
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField(
            "com.aqrlei.helper.log.engine.ILogEngine", "logger",
            "com.aqrlei.helper.log.LogHelper.module(\"${project.getName()}\")"
        )

        extra.set(LibKey.artifactIdKey, Libs.cache.artifactId)
        extra.set(LibKey.versionKey, Libs.cache.version)
        extra.set(LibKey.descKey, Libs.cache.desc)
    }
}

dependencies {

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.kotlin.coroutines)
    implementation(Deps.androidx.appcompat)
    implementation(Deps.lib.logHelper)
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
