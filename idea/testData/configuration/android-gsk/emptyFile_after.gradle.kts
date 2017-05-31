val kotlinVersion: String by extra
buildscript {
    var kotlinVersion: String by extra
    kotlinVersion = "$VERSION$"
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
    }
}
apply {
    plugin("kotlin-android")
}
dependencies {
    compile(kotlinModule("stdlib-jre7", kotlinVersion))
}
repositories {
    mavenCentral()
}