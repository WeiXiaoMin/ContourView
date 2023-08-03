plugins {
    id("com.android.application")
}

android {
    namespace = "com.ocnyang.contourviewdemo"
    compileSdk = 28

    defaultConfig {
        applicationId = "com.ocnyang.contourviewdemo"
        minSdk = 19
        targetSdk = 28
        versionCode = 2
        versionName = "1.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
    implementation("junit:junit:4.12")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    implementation(project(":contourview"))
    implementation("de.hdodenhof:circleimageview:2.2.0")
    implementation("com.android.support:design:28.0.0-rc02")
}