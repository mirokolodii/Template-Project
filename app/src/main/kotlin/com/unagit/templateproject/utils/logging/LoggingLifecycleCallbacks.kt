package com.unagit.templateproject.utils.logging

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import timber.log.Timber

class LoggingLifecycleCallbacks :
    Application.ActivityLifecycleCallbacks,
    FragmentManager.FragmentLifecycleCallbacks() {

    private fun log(objectName: String, methodName: String) {
        Timber.d("$objectName $methodName")
    }

    private fun getMethodName() = Thread.currentThread().stackTrace[3].methodName

    /* Activity */
    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        log(activity.javaClass.simpleName, getMethodName())
        (activity as AppCompatActivity).supportFragmentManager
            .registerFragmentLifecycleCallbacks(this, true)
    }

    override fun onActivityDestroyed(activity: Activity) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    override fun onActivityPaused(activity: Activity) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    override fun onActivityResumed(activity: Activity) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    override fun onActivitySaveInstanceState(
        activity: Activity,
        outState: Bundle?
    ) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    override fun onActivityStarted(activity: Activity) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    override fun onActivityStopped(activity: Activity) {
        log(activity.javaClass.simpleName, getMethodName())
    }

    /* Fragment */
    override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        super.onFragmentCreated(fm, f, savedInstanceState)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentViewCreated(
        fm: FragmentManager,
        f: Fragment,
        v: View,
        savedInstanceState: Bundle?
    ) {
        super.onFragmentViewCreated(fm, f, v, savedInstanceState)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentStopped(fm: FragmentManager, f: Fragment) {
        super.onFragmentStopped(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentResumed(fm: FragmentManager, f: Fragment) {
        super.onFragmentResumed(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
        super.onFragmentDestroyed(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentStarted(fm: FragmentManager, f: Fragment) {
        super.onFragmentStarted(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
        super.onFragmentViewDestroyed(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }

    override fun onFragmentPaused(fm: FragmentManager, f: Fragment) {
        super.onFragmentPaused(fm, f)
        log(f.javaClass.simpleName, getMethodName())
    }
}