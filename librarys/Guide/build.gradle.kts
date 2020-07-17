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

        extra.set(LibKey.artifactIdKey, Libs.guide.artifactId)
        extra.set(LibKey.versionKey, Libs.guide.version)
        extra.set(LibKey.descKey, Libs.guide.desc)
    }
}

dependencies {

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.androidx.appcompat)
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
