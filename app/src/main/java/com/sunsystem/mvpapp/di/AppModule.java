package com.sunsystem.mvpapp.di;

import com.sunsystem.mvpapp.Presenter;
import com.sunsystem.mvpapp.ViewContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by steve on 6/15/16.
 */
@Module
public class AppModule {
    private ViewContract mViewContract;

    public AppModule(ViewContract viewContract) {
        mViewContract = viewContract;
    }

    @Provides @Singleton
    public Presenter providesPresenter() {
        return new Presenter(mViewContract);
    }
}
