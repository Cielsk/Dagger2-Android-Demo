package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.di.ActivityScoped;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module(subcomponents = DummyFragmentComponent.class)
public class DummyActivityModule {

    @ActivityScoped
    @Provides
    DummyContract.Presenter provideDummyPresenter(DummyPresenter presenter) {
        return presenter;
    }
}
