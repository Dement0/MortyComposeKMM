buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
        classpath("com.android.tools.build:gradle:7.0.0-alpha05")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://dl.bintray.com/ekito/koin")
    }
}