package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Class11Activity extends AppCompatActivity {

     public Button btn_Class11English,btn_Class11Physics,btn_Class11Chemistry,btn_Class11Mathematics
             ,btn_Class11Bio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11);


        btn_Class11Physics=(Button)findViewById(R.id.buttonClass11Physics);
        btn_Class11Chemistry=(Button)findViewById(R.id.buttonClass11Chemistry);
        btn_Class11Mathematics=(Button)findViewById(R.id.buttonClass11Maths);
        btn_Class11English=(Button)findViewById(R.id.buttonClass11English);
        btn_Class11Bio=(Button)findViewById(R.id.buttonClass11Biology);



        btn_Class11Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11Activity.this,Class11PhysicsR.class);
                startActivity(intent);
            }
        });
        btn_Class11Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11Activity.this,Class11ChemistryR.class);
                startActivity(intent);
            }
        });
        btn_Class11Mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11Activity.this,Class11MathematicsR.class);
                startActivity(intent);
            }
        });
        btn_Class11English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11Activity.this,Class11EnglishR.class);
                startActivity(intent);
            }
        });
        btn_Class11Bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class11Activity.this,Class11BioR.class);
                startActivity(intent);
            }
        });





    }
}
