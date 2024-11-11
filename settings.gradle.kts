// Top-level settings file in Kotlin DSL

// 라이선스 헤더
// Copyright (C) 2016 The Android Open Source Project
// Licensed under the Apache License, Version 2.0

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":demo", ":library")