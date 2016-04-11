package com.clock.daemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.clock.daemon.service.ForegroundService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_foreground_service).setOnClickListener(this);
        findViewById(R.id.btn_background_service).setOnClickListener(this);
        findViewById(R.id.btn_bug_service).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_foreground_service) { //系统正常的前台Service
            Intent foreground = new Intent(this, ForegroundService.class);
            startService(foreground);

        } else if (viewId == R.id.btn_background_service) {//系统正常的后台Service

        } else if (viewId == R.id.btn_bug_service) {//利用系统Bug创建的Service

        }
    }
}
