package com.sunsystem.mvpapp.di;

import android.app.Application;

import com.sunsystem.mvpapp.JSONParser;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by steve on 6/15/16.
 */
@Module
public class AppParser {
    private Application mApplication;

    public AppParser(Application application) {
        mApplication = application;
    }

    @Provides @Singleton
    public JSONParser providesJSONParser() {
        return new JSONParser(mApplication);
    }
}
