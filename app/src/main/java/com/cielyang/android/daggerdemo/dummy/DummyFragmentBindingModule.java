package com.cielyang.android.daggerdemo.dummy;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/** */
@Module
public abstract class DummyFragmentBindingModule {

    @Binds
    @IntoMap
    @FragmentKey(DummyFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindDummyFragment(
            DummyFragmentComponent.Builder builder);
}
