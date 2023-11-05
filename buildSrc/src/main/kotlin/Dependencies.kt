object Versions {
    const val AGP = "8.1.2"
    const val lifecycle = "2.6.2"
    const val room = "2.6.0"
    const val kotlin = "1.8.21"
    const val coroutines = "1.7.1"
    const val core = "1.9.0"
    const val hilt = "2.46.1"
    const val dagger2 = "2.46.1"
    const val okHttp = "5.0.0-alpha.11"
    const val retrofit = "2.9.0"
    const val gsonconverter = "2.5.0"
    const val sqlite = "2.4.0"
    const val dublicate = "1.8.0"
    const val activity = "1.8.0"
    const val paging = "3.1.1"
    const val navigation = "2.5.3"
    const val compose = "1.5.4"
    const val coil = "2.2.2"
}

object Libraries {
    object Core {
        const val core = "androidx.core:core-ktx:${
            Versions.core
        }"
    }

    object Activity {
        const val activity = "androidx.activity:activity-compose:${Versions.activity}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${
            Versions.coroutines
        }"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${
            Versions.coroutines
        }"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${
            Versions.lifecycle
        }"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${
            Versions.lifecycle
        }"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${
            Versions.room
        }"
        const val compiler = "androidx.room:room-compiler:${
            Versions.room
        }"
        const val ktx = "androidx.room:room-ktx:${
            Versions.room
        }"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${
            Versions.retrofit
        }"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${
            Versions.retrofit
        }"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${
            Versions.gsonconverter
        }"
    }

    object OkHttp {
        const val bom = "com.squareup.okhttp3:okhttp-bom:${
            Versions.okHttp
        }"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }
    object UIComponents {
        const val androidui = "androidx.compose.ui:ui-android:${
            Versions.compose
        }"
        const val ui = "androidx.compose.ui:ui"
        const val graphics = "androidx.compose.ui:ui-graphics"
        const val preview = "androidx.compose.ui:ui-tooling-preview"
        const val material3 = "androidx.compose.materil3:material3"
        const val tooling = "androidx.compose.ui:ui-tooling"
        const val unit = "androidx.compose.ui:ui-test-junit4"
        const val manifest = "androidx.compose.ui:ui-test-manifest"
    }

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${
            Versions.navigation
        }"
        const val ui = "androidx.navigation:navigation-ui-ktx:${
            Versions.navigation
        }"
    }

    object Dagger2 {
        const val android = "com.google.dagger:hilt-android:${
            Versions.dagger2
        }"
        const val compiler = "com.google.dagger:hilt-compiler:${
            Versions.dagger2
        }"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${
            Versions.hilt
        }"
        const val compiler = "com.google.dagger:hilt-compiler:${
            Versions.hilt
        }"
    }

    object Paging {
        const val runtime = "androidx.paging:paging-runtime-ktx:${
            Versions.paging
        }"
        const val common = "androidx.paging:paging-common:${
            Versions.paging
        }"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${
            Versions.coil
        }"
    }

    object Dublicate {
        const val dublicate = "org.jetbrains.kotlin:kotlin-bom:${
            Versions.dublicate
        }"
    }
    object SqLite {
        const val sqlite = "androidx.sqlite:sqlite:${
            Versions.sqlite
        }"
        const val ktx = "androidx.sqlite:sqlite-ktx:${
            Versions.sqlite
        }"
        const val framework = "androidx.sqlite:sqlite-framework:${
            Versions.sqlite
        }"
    }
}

object Plugins {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "android"
        const val jvm = "jvm"
        const val kapt = "kapt"
    }

    object Navigation {
        const val safeArgs = "androidx.navigation.safeargs.kotlin"
    }

    object Hilt {
        const val android = "com.google.dagger.hilt.android"
    }
}