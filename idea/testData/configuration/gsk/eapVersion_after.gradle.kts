import org.gradle.api.JavaVersion.VERSION_1_7

val kotlinVersion: String by extra
buildscript {
    var kotlinVersion: String by extra
    kotlinVersion = "$VERSION$"
    repositories {
        maven {
            setUrl("http://dl.bintray.com/kotlin/kotlin-eap")
        }
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
    }
}
plugins {
    application
}
apply {
    plugin("kotlin")
}

application {
    mainClassName = "samples.HelloWorld"
}

java {
    sourceCompatibility = VERSION_1_7
    targetCompatibility = VERSION_1_7
}

repositories {
    jcenter()
    maven {
        setUrl("http://dl.bintray.com/kotlin/kotlin-eap")
    }
}

dependencies {
    testCompile("junit:junit:4.12")
    compile(kotlinModule("stdlib", kotlinVersion))
}

// VERSION: $VERSION$