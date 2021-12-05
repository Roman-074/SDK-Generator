import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    application
}

group = "me.roman"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}


dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.10")

    // code generator
    // https://square.github.io/kotlinpoet/
    implementation("com.squareup", "kotlinpoet", "1.10.2")

    // json parser
    // https://github.com/cbeust/klaxon
    implementation("com.beust:klaxon:5.5")

}