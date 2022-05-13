rootProject.name = "main-product"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("../features")

include(":demo-app")
