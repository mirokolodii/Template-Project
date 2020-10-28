object VersionsCore {
    const val gradle = "4.1.0"
    const val kotlin = "1.4.10"
}

object DependenciesCore {
    const val gradlePlugin = "com.android.tools.build:gradle:${VersionsCore.gradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${VersionsCore.kotlin}"
}