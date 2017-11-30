package com.cielyang.android.daggerdemo.dummy;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;

import javax.inject.Inject;

public class DummyActivity extends BaseActivity
        implements DummyFragment.OnDummyActivityFragmentInteractionListener {

    @Inject
    DummyContract.Presenter mPresenter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_layout);

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
}
