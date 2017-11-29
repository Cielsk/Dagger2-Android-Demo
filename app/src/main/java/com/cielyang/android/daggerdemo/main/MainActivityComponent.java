package com.cielyang.android.daggerdemo.main;

import com.cielyang.android.daggerdemo.di.ActivityScoped;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/** */
@ActivityScoped
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
