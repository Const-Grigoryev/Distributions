plugins {
	kotlin("jvm") version "2.0.20"
}

group = "dev.aspid812"
version = "1.0-SNAPSHOT"
description = "Sampling from various probability distributions in Kotlin/Java"

kotlin {
	jvmToolchain(17)
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test"))
}

tasks.test {
	useJUnitPlatform()
}
