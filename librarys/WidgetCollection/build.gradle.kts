plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
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

        extra.set(LibKey.artifactIdKey, Libs.widgets.artifactId)
        extra.set(LibKey.versionKey, Libs.widgets.version)
        extra.set(LibKey.descKey, Libs.widgets.desc)
    }
}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    api(Deps.kotlin.stdlib)

    api(Deps.androidx.viewpager2)
    api(Deps.androidx.appcompat)
    api(Deps.androidx.constraint)

    implementation("${PublishConfig.groupId}:${Libs.logHelper.artifactId}:${Libs.logHelper.version}")
}
apply(from = rootProject.file("gradle/lib_maven_publish.gradle.kts"))
