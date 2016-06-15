package com.sunsystem.mvpapp.di;

import com.sunsystem.mvpapp.FragmentView;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by steve on 6/15/16.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(FragmentView target);
}
