package com.securenote;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by serhii.hrabas on 5/25/2017.
 */

public class SecureNoteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
