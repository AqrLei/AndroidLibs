plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")

}

android {
    compileSdkVersion(App.compileSdk)

    defaultConfig {
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = App.versionCode
        versionName = App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }


    kotlinOptions {
        jvmTarget = "1.8"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            ndk {
                abiFilters("armeabi-v7a")
            }
        }
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar","*.aar"))))

    implementation(Deps.kotlin.stdlib)
    implementation(Deps.kotlin.coroutines)

    implementation(Deps.androidx.appcompat)
    implementation(Deps.androidx.constraint)

    implementation(Deps.okhttp.okhttp)
    implementation(Deps.moshi.moshi)
    implementation(Deps.moshi.moshi_kotlin)
    kapt(Deps.moshi.moshi_kotlin_codegen)

    testImplementation(Deps.junit)
    testImplementation(Deps.androidx.junit_ext)
    testImplementation(Deps.androidx.junit_ktx_ext)
}
