package com.warmme.smsshare;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmsHandler.sendSmsAsy(new SmsInfo("18575582923","onCreate:=>【短信签名】"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}





