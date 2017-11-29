package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.ActivityScoped;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/** */
@ActivityScoped
@Subcomponent(modules = {DummyActivityModule.class, DummyFragmentBindingModule.class})
public interface DummyActivityComponent extends AndroidInjector<DummyActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DummyActivity> {
    }
}
