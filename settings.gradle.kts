rootProject.name = "umbrella"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("main-product")
includeBuild("demo-product")
includeBuild("features")
includeBuild("build-logic")
