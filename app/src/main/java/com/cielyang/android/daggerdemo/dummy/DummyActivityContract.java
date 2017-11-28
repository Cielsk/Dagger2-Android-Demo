package com.cielyang.android.daggerdemo.dummy;

import com.cielyang.android.daggerdemo.base.BasePresenter;
import com.cielyang.android.daggerdemo.base.BaseView;

public interface DummyActivityContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter<View> {

    }
}
