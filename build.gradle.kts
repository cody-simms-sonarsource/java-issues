plugins {
    java
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.organization", "cody-simms-sonarsource"
        property("sonar.projectKey", "cody-simms-sonarsource_java-issues")
        property("sonar.token", "86bb61c848e53dda08c619a0f6442f6d4b5ee7a8")
        property("sonar.sources", "./src")
    }
}

