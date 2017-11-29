package com.cielyang.android.daggerdemo.di;

import android.app.Application;
import android.content.Context;

import com.cielyang.android.daggerdemo.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/** */
@Module(subcomponents = {MainActivityComponent.class})
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }
}
