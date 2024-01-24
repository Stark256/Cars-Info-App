pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Cars Info"
include(":app")
include(":data")
include(":database")
include(":feature:search")
include(":feature:account")
include(":feature:favourites")
include(":common")
