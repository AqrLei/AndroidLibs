
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

        extra.set(LibKey.artifactIdKey,Libs.logHelper.artifactId)
        extra.set(LibKey.versionKey,Libs.logHelper.version)
        extra.set(LibKey.descKey,Libs.logHelper.desc)
    }

}

dependencies {

    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api(Deps.kotlin.stdlib)
    api(Deps.androidx.appcompat)

    testImplementation(Deps.junit)
    testImplementation(Deps.androidx.junit_ext)
    testImplementation(Deps.androidx.junit_ktx_ext)
}

apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
