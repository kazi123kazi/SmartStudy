package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Class11BioVdo extends AppCompatActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11_bio_vdo);


        mWebView=(WebView)findViewById(R.id.class11BVdoWeb);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.youtube.com/watch?v=gfjTBaMF8pY&list=PLNz32RYOjBer1sk9r4j7KqLm3Zc9nwSSE");


    }
}
