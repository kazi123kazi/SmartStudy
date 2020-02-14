package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class11PhysicsR extends AppCompatActivity {

    public Button Class11PVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11_physics_r);

        Class11PVideo= (Button)findViewById(R.id.Class11PhysicsVideo);
        Class11PVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11PhysicsR.this,class11PhysicsVdo.class);
                startActivity(intent);

            }
        });
    }
}
