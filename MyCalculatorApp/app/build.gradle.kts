plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mycalculator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mycalculator"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.core:core-ktx:1.13.0")
}
