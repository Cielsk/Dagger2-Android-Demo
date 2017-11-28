package com.cielyang.android.daggerdemo.dummy;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;

public class DummyActivityActivity extends BaseActivity
        implements DummyActivityFragment.OnDummyActivityFragmentInteractionListener {

    DummyActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dummy_layout);

        DummyActivityFragment fragment =
                (DummyActivityFragment)
                        getSupportFragmentManager().findFragmentById(R.id.frame_layout_content);
        if (fragment == null) {
            fragment = DummyActivityFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frame_layout_content, fragment);
            transaction.commit();
        }
        mPresenter = new DummyActivityPresenter();
        fragment.setPresenter(mPresenter);
    }

    @Override
    public void onDummyActivityFragmentInteraction() {
    }
}
