plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
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
        extra.set(LibKey.artifactIdKey, Libs.net.artifactId)
        extra.set(LibKey.versionKey, Libs.net.version)
        extra.set(LibKey.descKey, Libs.net.desc)
    }
}

dependencies {

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.kotlin.coroutines)

    api(Deps.okhttp.okhttp)
    api(Deps.moshi.moshi)
    api(Deps.moshi.moshi_kotlin)
    kapt(Deps.moshi.moshi_kotlin_codegen)

    api(Deps.gson)

    implementation(Deps.lib.logHelper)

    implementation(Deps.lib.utilCollection)
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
