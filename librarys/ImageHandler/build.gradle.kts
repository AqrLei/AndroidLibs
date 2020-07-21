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

        extra.set(LibKey.artifactIdKey, Libs.imagehandler.artifactId)
        extra.set(LibKey.versionKey, Libs.imagehandler.version)
        extra.set(LibKey.descKey, Libs.imagehandler.desc)
    }
}

dependencies {

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.kotlin.coroutines)
    implementation(Deps.androidx.appcompat)

    implementation(Deps.lib.cache)
    implementation(Deps.zxing)
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
