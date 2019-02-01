package com.example.saber.slideback;

import android.os.Bundle;

import com.saber.chentianslideback.SlideBackActivity;

public class SecondActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSlideBackDirection(SlideBackActivity.RIGHT);
    }

    @Override
    protected void slideBackSuccess() {
        finish();
    }
}
