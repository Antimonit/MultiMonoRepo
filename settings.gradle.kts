rootProject.name = "umbrella"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("main-product")
includeBuild("features")
includeBuild("build-logic")
