plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "3.1.0"    // applies the runServer command
}

group = "io.github.kyriennn"
version = "1.0.0"

//where the paper api will be downloaded from
repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/"){ name = "papermc"}
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.2.build.+")
}

java{
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}

tasks{
    runServer{
        minecraftVersion("26.2")
    }
}