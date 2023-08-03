plugins {
    id("com.android.application").version("7.3.0") apply false
    id("com.android.library").version("7.3.0") apply false
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}