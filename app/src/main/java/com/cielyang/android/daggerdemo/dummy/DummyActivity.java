package com.cielyang.android.daggerdemo.dummy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class DummyActivity extends BaseActivity
        implements DummyFragment.OnDummyActivityFragmentInteractionListener,
        HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> mInjector;

    @Inject
    DummyContract.Presenter mPresenter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_layout);

        AndroidInjection.inject(this);

        DummyFragment fragment =
                (DummyFragment)
                        getSupportFragmentManager().findFragmentById(R.id.frame_layout_content);
        if (fragment == null) {
            fragment = DummyFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frame_layout_content, fragment);
            transaction.commit();
        }
    }

    @Override
    public void onDummyActivityFragmentInteraction() {
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return mInjector;
    }
}
