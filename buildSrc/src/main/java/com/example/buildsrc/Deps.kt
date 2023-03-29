package com.example.buildsrc


object Configs {
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    const val CoreKtx = "1.7.0"
    const val ComposeUiVersion = "1.2.0"
    const val MaterialVersion = "1.2.0"
}

object Libs {
    const val CoreKtx = "androidx.core:core-ktx:${Versions.CoreKtx}"
    const val ComposeUi = "androidx.compose.ui:ui:${Versions.ComposeUiVersion}"
    const val ComposUiPreview="androidx.compose.ui:ui-tooling-preview:${Versions.ComposeUiVersion}"
    const val Material = "androidx.compose.material:material:${Versions.MaterialVersion}"
    const val Activity = "androidx.activity:activity-compose:1.3.1"
    const val LifeCycleRunTime="androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val Tooling = "androidx.compose.ui:ui-tooling:${Versions.ComposeUiVersion}"
    const val Manifest = "androidx.compose.ui:ui-test-manifest:${Versions.ComposeUiVersion}"
}

object TestingLibs{
    const val Junit = "junit:junit:4.13.2"
    const val JunitExt= "androidx.test.ext:junit:1.1.5"
    const val Espresso = "androidx.test.espresso:espresso-core:3.5.1"
    const val ComposeUiTestJunit= "androidx.compose.ui:ui-test-junit4:${Versions.ComposeUiVersion}"
}