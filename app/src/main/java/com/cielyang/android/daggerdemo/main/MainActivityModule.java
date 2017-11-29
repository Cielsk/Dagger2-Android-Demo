package com.cielyang.android.daggerdemo.main;

import com.cielyang.android.daggerdemo.di.ActivityScoped;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class MainActivityModule {

    @ActivityScoped
    @Provides
    String provideToastContent() {
        return "Main activity injection succeed!";
    }
}
