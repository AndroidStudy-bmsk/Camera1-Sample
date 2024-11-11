plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "com.google.cameraview.library"
    compileSdk = libs.versions.compileSdk.get().toInt()
    buildToolsVersion = libs.versions.buildTools.get()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/base", "src/main/api14", "src/main/api21", "src/main/api23")
        }
    }
}

dependencies {
    implementation(libs.annotation)
    implementation(libs.legacySupport)

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.testRunner)
    androidTestImplementation(libs.espressoCore)
}