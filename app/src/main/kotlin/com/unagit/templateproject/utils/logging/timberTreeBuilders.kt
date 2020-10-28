package com.unagit.templateproject.utils.logging

import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import timber.log.Timber

fun buildHyperLinkedDebugTree() = object : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        with(element) { return "($fileName:$lineNumber)#$methodName" }
    }
}

fun buildCrashlyticsTree() = object : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.ERROR) {
            val exception = t ?: Exception(message)
            FirebaseCrashlytics.getInstance().recordException(exception)
        }
    }
}