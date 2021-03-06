package com.nsystem.travel.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract View getView();

    public abstract void setup();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        setup();
    }

    protected <T> void startActivity(Class<T> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
