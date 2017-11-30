package com.cielyang.android.daggerdemo.di;

import android.app.Activity;

import com.cielyang.android.daggerdemo.dummy.DummyActivity;
import com.cielyang.android.daggerdemo.dummy.DummyActivityComponent;
import com.cielyang.android.daggerdemo.main.MainActivity;
import com.cielyang.android.daggerdemo.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/** */
@Module(subcomponents = {MainActivityComponent.class, DummyActivityComponent.class})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
            MainActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(DummyActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDummyActivityInjectorFactory(
            DummyActivityComponent.Builder builder);
}
