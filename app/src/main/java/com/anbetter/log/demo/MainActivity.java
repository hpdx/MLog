package com.anbetter.log.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anbetter.log.MLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // https://github.com/hpdx/MLog.git

        // 设置LOG开关和全局Tag
        MLog.init(true, "MLog");

        // 使用全局Tag
        MLog.v("Hello World");
        MLog.i("Hello World");
        MLog.d("Hello World");
        MLog.e("Hello World");
        MLog.w("Hello World");

        // 使用局部Tag
        MLog.v("Test", "Hello World");
        MLog.i("Test", "Hello World");
        MLog.d("Test", "Hello World");
        MLog.e("Test", "Hello World");
        MLog.w("Test", "Hello World");


    }
}
