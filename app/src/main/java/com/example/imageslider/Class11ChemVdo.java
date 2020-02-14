package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Class11ChemVdo extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11_chem_vdo);
        mWebView=(WebView)findViewById(R.id.class11CVdoWeb);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.youtube.com/watch?v=Qy0Q_AYs63Y&list=PLF_7kfnwLFCFByfL28A5RbN7Bee-DLoX4");
    }
}
