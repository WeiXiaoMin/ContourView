plugins {
    id("com.android.library")
}

android {
    namespace = "com.ocnyang.contourview"
    compileSdk = 28

    defaultConfig {
        minSdk = 15
        targetSdk = 28

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.0", {
        exclude(group = "com.android.support", module = "support-annotations")
    })

    implementation("com.android.support:appcompat-v7:28.0.0-rc02")
    testImplementation("junit:junit:4.12")
}