package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassTESTActivity extends AppCompatActivity {
   Button class11Test,class12Test,classJEETest,classNEETTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_test);
        class11Test=(Button)findViewById(R.id.class11test);
        class12Test=(Button)findViewById(R.id.class12test);
        classJEETest=(Button)findViewById(R.id.classJEEtest);
        classNEETTest=(Button)findViewById(R.id.classNEETtest);



        class11Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassTESTActivity.this,TestAllEmbibe.class);
                startActivity(intent);
            }
        });
        class12Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassTESTActivity.this,TestAllEmbibe.class);
                startActivity(intent);
            }
        });
        classJEETest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassTESTActivity.this,TestAllEmbibe.class);
                startActivity(intent);
            }
        });
        classNEETTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassTESTActivity.this,TestAllEmbibe.class);
                startActivity(intent);
            }
        });

    }
}
