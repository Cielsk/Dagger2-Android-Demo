package com.cielyang.android.daggerdemo.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;
import com.cielyang.android.daggerdemo.dummy.DummyActivityActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_dummy_activity)
    AppCompatButton mBtnDummyActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_dummy_activity)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this, DummyActivityActivity.class));
    }
}
