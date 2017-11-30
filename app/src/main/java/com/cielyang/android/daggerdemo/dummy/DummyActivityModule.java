package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.ActivityScoped;
import com.cielyang.android.daggerdemo.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;

/** */
@Module
public abstract class DummyActivityModule {

    @FragmentScoped
    @Binds
    abstract DummyContract.View bindDummyView(DummyFragment fragment);

    @ActivityScoped
    @Binds
    abstract DummyContract.Presenter bindDummyPresenter(DummyPresenter presenter);
}
