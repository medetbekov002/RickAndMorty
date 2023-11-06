plugins {
    id(Plugins.AGP.application)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.kapt)

    // Navigation Safe Args
    id(Plugins.Navigation.safeArgs)

    // Hilt
//    id(Plugins.Hilt.android)

    // Kotlin-Parcelize
    id(Plugins.Parcelize.kotlinparcelize)
}

android {
    namespace = "com.london.rickandmorty"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.london.rickandmorty"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName(AndroidConfig.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }

        getByName(AndroidConfig.debug) {
            applicationIdSuffix = ".${AndroidConfig.debug}"
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = Options.compileOptions
        targetCompatibility = Options.compileOptions
    }
    kotlinOptions {
        jvmTarget = Options.kotlinOptions
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    dependencies {
        implementation(project(mapOf("path" to ":data")))
        implementation(project(mapOf("path" to ":domain")))

        implementation("androidx.core:core-ktx:1.9.0")
        //implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

        // Activity and Compose bom
        implementation(Libraries.Activity.activity)
        implementation(platform("androidx.compose:compose-bom:2023.03.00"))

        // Compose UI
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.compose.ui:ui-android:1.5.4")
        implementation("com.google.android.engage:engage-core:1.3.1")

        // JUnit test
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")

        // Compose UI
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // ViewBinding property delegate
        implementation(Libraries.UIComponents.vbpd)

        // Room
        implementation(Libraries.Room.runtime)
        kapt(Libraries.Room.compiler)
        implementation(Libraries.Room.ktx)

        // Paging
        implementation(Libraries.Paging.runtime)
        implementation(Libraries.Paging.common)

        // Coroutines
        implementation(Libraries.Coroutines.core)
        implementation(Libraries.Coroutines.android)

        // Coroutine Lifecycle Scopes
        implementation(Libraries.Coroutines.core)
        implementation(Libraries.Coroutines.android)

//        // Dagger-Hilt
//        implementation(Libraries.Hilt.android)
//        kapt(Libraries.Hilt.compiler)

        // Dagger2
        implementation(Libraries.Dagger2.android)
        kapt(Libraries.Dagger2.compiler)

        // Javax Inject
        api(Libraries.Javax.inject)

        // Coil
        implementation(Libraries.Coil.coil)

        // Nav graph
        implementation(Libraries.Navigation.ui)
        implementation(Libraries.Navigation.fragment)

        // Retrofit
        implementation(Libraries.Retrofit.retrofit)
        implementation(Libraries.Retrofit.converterMoshi)
        implementation(Libraries.Retrofit.gsonConverter)

        // OkHttp
        implementation(Libraries.OkHttp.okHttp)
        implementation(Libraries.OkHttp.bom)
        implementation(Libraries.OkHttp.loggingInterceptor)

        // Error dublicate dependency
        implementation(platform(Libraries.Dublicate.dublicate))

        // Sqlite
        implementation(Libraries.SqLite.sqlite)
        implementation(Libraries.SqLite.ktx)
        implementation(Libraries.SqLite.framework)
    }
}