package com.cielyang.android.daggerdemo.base;

import android.app.Activity;
import android.app.Application;

import com.cielyang.android.daggerdemo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/** */
public class MyApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mInjector;
    }
}
