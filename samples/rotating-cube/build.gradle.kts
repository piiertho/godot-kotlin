import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    fun KotlinNativeTargetWithTests.configure() {
        binaries {
            sharedLib(listOf(NativeBuildType.DEBUG))
        }
    }

    val target = if (Os.isFamily(Os.FAMILY_MAC)) {
        macosX64("rotatingCube")
    } else if (Os.isFamily(Os.FAMILY_WINDOWS)) {
        mingwX64("rotatingCube")
    } else if (Os.isFamily(Os.FAMILY_UNIX)) {
        linuxX64("rotatingCube")
    } else {
        throw AssertionError("Unsupported os.")
    }

    target.configure()

    sourceSets {
        val rotatingCubeMain by getting {
            dependencies {
                api(project(":"))
            }
        }
    }
}

