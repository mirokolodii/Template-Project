object VersionsGoogle {
    const val googleServices = "4.3.4"
    const val firebaseBoM = "26.0.0"
}

object DependenciesGoogle {
    const val googleServicesGradlePlugin =
        "com.google.gms:google-services:${VersionsGoogle.googleServices}"
    const val firebaseBoM = "com.google.firebase:firebase-bom:${VersionsGoogle.firebaseBoM}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
}