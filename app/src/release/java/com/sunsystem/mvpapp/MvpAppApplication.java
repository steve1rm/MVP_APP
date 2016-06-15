package com.sunsystem.mvpapp;

import android.app.Application;

import com.sunsystem.mvpapp.log.ReleaseTree;

import timber.log.Timber;

/**
 * Created by steve on 6/15/16.
 */
public class MvpAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new ReleaseTree());
    }
}
