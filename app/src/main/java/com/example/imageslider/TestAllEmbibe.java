package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TestAllEmbibe extends AppCompatActivity {
    WebView testallembibe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_all_embibe);

        testallembibe=findViewById(R.id.testWebview);
        testallembibe.getSettings().setJavaScriptEnabled(true);
        testallembibe.setWebViewClient(new WebViewClient());
        testallembibe.loadUrl("https://www.embibe.com/engineering/test");


    }
}
