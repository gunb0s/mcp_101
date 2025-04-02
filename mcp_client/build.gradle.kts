val anthropicVersion = "0.8.0"

plugins {
    application
}

application {
    mainClass = "MainKt"
}

dependencies {
    implementation("com.anthropic:anthropic-java:$anthropicVersion")
}
