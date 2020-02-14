package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class class11PhysicsVdo extends AppCompatActivity {
      private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11_physics_vdo);

        mWebView=(WebView)findViewById(R.id.class11PVdoWeb);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.youtube.com/watch?v=jnpB9tBSzYg&list=PL6Km5wyRFsMyI9vHi9oWpakNr3bC9VQGp");
    }
}
