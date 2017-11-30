package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 *
 */
@Module
public abstract class DummyFragmentBindingModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = DummyFragmentModule.class)
    abstract DummyFragment bindDummyFragment();
}
