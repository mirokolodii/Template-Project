object VersionsGoogle {
    const val googleServices = "4.3.4"
    const val playServicesMaps = "17.0.0"
    const val playServicesLocation = "17.1.0"
    const val playServicesFitness = "19.0.0"
    const val firebaseBoM = "26.0.0"
    const val crashlyticsGradlePlugin = "2.3.0"
}

object DependenciesGoogle {
    const val googleServicesGradlePlugin = "com.google.gms:google-services:${VersionsGoogle.googleServices}"
    const val playServicesLocation = "com.google.android.gms:play-services-location:${VersionsGoogle.playServicesLocation}"
    const val playServicesFitness = "com.google.android.gms:play-services-fitness:${VersionsGoogle.playServicesFitness}"
    const val crashlyticsGradlePlugin = "com.google.firebase:firebase-crashlytics-gradle:${VersionsGoogle.crashlyticsGradlePlugin}"
    const val firebaseBoM = "com.google.firebase:firebase-bom:${VersionsGoogle.firebaseBoM}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
}