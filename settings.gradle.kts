// https://docs.gradle.org/current/userguide/declaring_repositories.html
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven {
            url = uri("https://cardinalcommerceprod.jfrog.io/artifactory/android")
            credentials {
                username = "braintree_team_sdk"
                password = "AKCp8jQcoDy2hxSWhDAUQKXLDPDx6NYRkqrgFLRc3qDrayg6rrCbJpsKKyMwaykVL8FWusJpp"
            }
            content {
                // this repository *only* contains artifacts with specified group
                includeModule("org.jfrog.cardinalcommerce.gradle", "cardinalmobilesdk")
            }
        }
        maven {
            url = uri("https://maven.lokalise.com")
            content {
                includeGroup("com.lokalise.android")
            }
        }
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        gradlePluginPortal()
        maven {
            url = uri("https://cardinalcommerceprod.jfrog.io/artifactory/android")
            credentials {
                username = "braintree_team_sdk"
                password = "AKCp8jQcoDy2hxSWhDAUQKXLDPDx6NYRkqrgFLRc3qDrayg6rrCbJpsKKyMwaykVL8FWusJpp"
            }
            content {
                // this repository *only* contains artifacts with specified group
                includeModule("org.jfrog.cardinalcommerce.gradle", "cardinalmobilesdk")
            }
        }
        maven {
            url = uri("https://maven.lokalise.com")
            content {
                includeGroup("com.lokalise.android")
            }
        }
    }

    versionCatalogs {
        create("moengage") {
            from("com.moengage:android-dependency-catalog:2.4.2")
        }
    }
}

rootProject.name = "version-catalog-issue-80"

include(":app")
