rootProject.name = "main-product"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":app")
include(":featureOne")
project(":featureOne").projectDir = file("features/featureOne")
include(":featureTwo")
project(":featureTwo").projectDir = file("features/featureTwo")
