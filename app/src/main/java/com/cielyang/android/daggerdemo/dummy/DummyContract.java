package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.base.BasePresenter;
import com.cielyang.android.daggerdemo.base.BaseView;

public interface DummyContract {

    interface View extends BaseView<Presenter> {

        void showContent();
    }

    interface Presenter extends BasePresenter<View> {

        void loadContent();
    }
}
