plugins {
    java
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.organization", "default-organization")
        property("sonar.projectKey", "deafault-organization_java-issues")
        property("sonar.token", "86bb61c848e53dda08c619a0f6442f6d4b5ee7a8")
        property("sonar.sources", "./src")
        property("sonar.host.url", "https://codysimms.ngrok.io")
    }
}

