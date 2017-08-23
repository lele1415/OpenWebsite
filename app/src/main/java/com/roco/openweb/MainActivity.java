package com.roco.openweb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String customUrl = "http://rcaav.com/tablets/welcome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openUrl();
    }

    private void openUrl() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(customUrl);
        intent.setData(uri);
        startActivity(intent);
        finish();
    }
}
