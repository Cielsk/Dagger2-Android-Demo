package com.cielyang.android.daggerdemo.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.widget.Toast;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;
import com.cielyang.android.daggerdemo.dummy.DummyActivity;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_dummy_activity)
    AppCompatButton mBtnDummyActivity;

    @Inject
    @Named("main")
    String mToastContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (mToastContent != null) {
            Toast.makeText(this, mToastContent, Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_dummy_activity)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this, DummyActivity.class));
    }
}
