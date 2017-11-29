package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.FragmentScoped;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/** */
@FragmentScoped
@Subcomponent(modules = DummyFragmentModule.class)
public interface DummyFragmentComponent extends AndroidInjector<DummyFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DummyFragment> {
    }
}
