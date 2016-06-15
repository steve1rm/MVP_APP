package com.sunsystem.mvpapp.di;

import com.sunsystem.mvpapp.Presenter;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by steve on 6/15/16.
 */
@Singleton
@Component(modules = {AppParser.class})
public interface AppParserComponent {
    void inject(Presenter target);
}
