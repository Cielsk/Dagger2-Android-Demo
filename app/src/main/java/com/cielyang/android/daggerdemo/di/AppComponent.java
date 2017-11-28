package com.cielyang.android.daggerdemo.di;

import android.app.Application;

import com.cielyang.android.daggerdemo.base.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/** */
@Component(modules = {AppModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent {

    void inject(MyApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
