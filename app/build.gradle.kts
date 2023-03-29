import com.example.buildsrc.*

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {

    compileSdk = Configs.compileSdk

    defaultConfig {
        applicationId = "com.example.kotlindsl"
        minSdk = Configs.minSdk
        targetSdk = Configs.targetSdk
        versionCode = Configs.versionCode
        versionName = Configs.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.ComposeUiVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}



dependencies {

    implementation(Libs.CoreKtx)
    implementation(Libs.LifeCycleRunTime)
    implementation(Libs.Activity)
    implementation(Libs.ComposeUi)
    implementation(Libs.ComposUiPreview)
    implementation(Libs.Material)

    testImplementation(TestingLibs.Junit)
    androidTestImplementation(TestingLibs.JunitExt)
    androidTestImplementation(TestingLibs.Espresso)
    androidTestImplementation(TestingLibs.ComposeUiTestJunit)

    debugImplementation(Libs.Tooling)
    debugImplementation(Libs.Manifest)
}