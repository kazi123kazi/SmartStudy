package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Class12PhysicsVdo extends AppCompatActivity {
     private WebView Class12PhysicsVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class12_physics_vdo);

        Class12PhysicsVideo=findViewById(R.id.Class12PhVdoWeb);


        Class12PhysicsVideo.getSettings().setJavaScriptEnabled(true);
        Class12PhysicsVideo.setWebViewClient(new WebViewClient());
        Class12PhysicsVideo.loadUrl("  https://www.youtube.com/watch?v=BjkzTGFgqxs&list=PLsScQhOk9rsMUKOjzh_uTsilC84B59wZ8");

    }
}
