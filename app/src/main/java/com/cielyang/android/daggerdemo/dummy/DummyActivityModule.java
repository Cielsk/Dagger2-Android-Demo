package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.ActivityScoped;

import dagger.Binds;
import dagger.Module;

/** */
@Module
public abstract class DummyActivityModule {

    @ActivityScoped
    @Binds
    abstract DummyContract.Presenter bindDummyPresenter(DummyPresenter presenter);
}
