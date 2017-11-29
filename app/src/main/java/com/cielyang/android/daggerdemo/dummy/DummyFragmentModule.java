package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.FragmentScoped;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/** */
@Module
public class DummyFragmentModule {

    @FragmentScoped
    @Provides
    DummyContract.View provideDummyView(DummyFragment fragment) {
        return fragment;
    }

    @FragmentScoped
    @Provides
    @Named("dummy")
    String provideContent() {
        return "Fragment injection succeed!";
    }
}
