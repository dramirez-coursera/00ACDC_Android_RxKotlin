package org.coursera.android.acdc

import android.app.Application
import timber.log.Timber

class AcdcApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}