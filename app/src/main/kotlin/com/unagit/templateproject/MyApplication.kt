package com.unagit.templateproject

import android.app.Application
import com.unagit.templateproject.utils.logging.LoggingLifecycleCallbacks
import com.unagit.templateproject.utils.logging.buildCrashlyticsTree
import com.unagit.templateproject.utils.logging.buildHyperLinkedDebugTree
import timber.log.Timber

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogging()
    }

    private fun initLogging() {
        Timber.plant(if (BuildConfig.DEBUG) buildHyperLinkedDebugTree() else buildCrashlyticsTree())
        System.setProperty("kotlinx.coroutines.debug", if (BuildConfig.DEBUG) "on" else "off")
        if(BuildConfig.DEBUG) {
            registerActivityLifecycleCallbacks(LoggingLifecycleCallbacks())
        }
    }
}