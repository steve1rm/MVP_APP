package com.sunsystem.mvpapp;

import android.app.Application;

import com.sunsystem.mvpapp.di.AppParser;
import com.sunsystem.mvpapp.di.AppParserComponent;
import com.sunsystem.mvpapp.di.DaggerAppParserComponent;
import timber.log.Timber;

/**
 * Created by steve on 6/15/16.
 */
public class MvpAppApplication extends Application {
    private static Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = MvpAppApplication.this;

        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return super.createStackElementTag(element) + ":" + element.getLineNumber();
            }
        });
    }

    /* Inject the dependency into the presenter */
    public static AppParserComponent DaggerInjector() {
        return DaggerAppParserComponent.builder()
                .appParser(new AppParser(mApplication))
                .build();
    }
}
