buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
    }
}
plugins {
    id(Plugins.AGP.application) version Versions.AGP apply false
    id(Plugins.AGP.library) version Versions.AGP apply false
    kotlin(Plugins.Kotlin.android) version Versions.kotlin apply false

    // Navigation Safe Args
    id(Plugins.Navigation.safeArgs) version Versions.navigation apply false

    // Hilt
//    id(Plugins.Hilt.android) version Versions.hilt apply false
}