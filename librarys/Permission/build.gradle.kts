plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(App.compileSdk)

    defaultConfig {
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        extra.set(LibKey.artifactIdKey, Libs.permission.artifactId)
        extra.set(LibKey.versionKey, Libs.permission.version)
        extra.set(LibKey.descKey, Libs.permission.desc)
    }
}

dependencies {

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.kotlin.coroutines)
    api(Deps.androidx.core_ktx)

    implementation(Deps.androidx.appcompat)
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
