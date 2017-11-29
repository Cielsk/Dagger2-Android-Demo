package com.cielyang.android.daggerdemo.di;

import android.app.Activity;

import com.cielyang.android.daggerdemo.main.MainActivity;
import com.cielyang.android.daggerdemo.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/** */
@Module
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(
            MainActivityComponent.Builder builder);
}
