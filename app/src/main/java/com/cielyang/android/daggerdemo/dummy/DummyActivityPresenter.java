package com.cielyang.android.daggerdemo.dummy;

public class DummyActivityPresenter implements DummyActivityContract.Presenter {

    private DummyActivityContract.View mView;

    public DummyActivityPresenter() {
    }

    @Override
    public void takeView(DummyActivityContract.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }
}
