package com.cielyang.android.daggerdemo.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.widget.Toast;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseActivity;
import com.cielyang.android.daggerdemo.dummy.DummyActivityActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_dummy_activity)
    AppCompatButton mBtnDummyActivity;

    @Inject
    String mToastContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidInjection.inject(this);
        ButterKnife.bind(this);

        if (mToastContent != null) {
            Toast.makeText(this, mToastContent, Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_dummy_activity)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this, DummyActivityActivity.class));
    }
}
