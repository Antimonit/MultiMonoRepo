package com.sample.gradle

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        /*
         * Optional.
         * The default target version for Kotlin/JVM compilations is 1.8 since Kotlin 1.5.0.
         * The 1.6 JVM target is deprecated.
         * See https://kotlinlang.org/docs/whatsnew15.html#new-default-jvm-target-1-8
         * See https://kotlinlang.org/docs/gradle.html#attributes-specific-to-jvm
         */
        jvmTarget = "1.8"

        /*
         * See https://kotlinlang.org/docs/opt-in-requirements.html#module-wide-opt-in
         */
        freeCompilerArgs = freeCompilerArgs + listOf("-Xopt-in=kotlin.RequiresOptIn")
    }
}

dependencies {
    // A dependency on the standard library (stdlib) is added automatically to each source set. The
    // version of the standard library used is the same as the version of the Kotlin Gradle plugin
    //
    // The Kotlin Gradle plugin will select the appropriate JVM standard library depending on the
    // `kotlinOptions.jvmTarget` compiler option of your Gradle build script.
    //
    // See https://kotlinlang.org/docs/gradle.html#dependency-on-the-standard-library
    implementation(kotlin("stdlib-jdk8"))
}
