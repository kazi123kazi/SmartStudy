package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class12PhysicsR extends AppCompatActivity {

    private Button Class12PhysicsVdo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class12_physics_r);

        Class12PhysicsVdo=(Button)findViewById(R.id.buttonClass12Physics);
//        Class12PhysicsVdo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Class12PhysicsR.this, Class12PhysicsVdo.class);
//                startActivity(intent);
//            }
//        });

    }
}
