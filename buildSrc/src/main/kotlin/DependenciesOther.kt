object VersionsOther {
    const val timber = "4.7.1"
    const val realm = "10.0.0"
    const val socketIO = "1.0.0"
    const val desugarJdkLibs = "1.0.10"
    const val butterKnife = "10.2.3"
    const val rxBluetooth = "2.1.1"
}

object DependenciesOther {
    const val timber = "com.jakewharton.timber:timber:${VersionsOther.timber}"
    const val realmGradlePlugin = "io.realm:realm-gradle-plugin:${VersionsOther.realm}"
    const val socketIO = "io.socket:socket.io-client:${VersionsOther.socketIO}"
    const val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:${VersionsOther.desugarJdkLibs}"
    const val butterKnife = "com.jakewharton:butterknife:${VersionsOther.butterKnife}"
    const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:${VersionsOther.butterKnife}"
    const val rxBluetooth = "com.github.ivbaranov:rxbluetooth2:${VersionsOther.rxBluetooth}"
}