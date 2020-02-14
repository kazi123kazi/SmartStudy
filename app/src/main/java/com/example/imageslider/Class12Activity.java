package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Class12Activity extends AppCompatActivity {

    public Button btn_Class12English,btn_Class12Physics,btn_Class12Chemistry,btn_Class12Mathematics
            ,btn_Class12Bio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class12);

        btn_Class12Physics=(Button)findViewById(R.id.buttonClass12Physics);
        btn_Class12Chemistry=(Button)findViewById(R.id.buttonClass12Chemistry);
        btn_Class12Mathematics=(Button)findViewById(R.id.buttonClass12Maths);
        btn_Class12English=(Button)findViewById(R.id.buttonClass12English);
        btn_Class12Bio=(Button)findViewById(R.id.buttonClass12Biology);



        btn_Class12Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class12Activity.this,Class12PhysicsR.class);
                startActivity(intent);
            }
        });
        btn_Class12Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class12Activity.this,Class12ChemistryR.class);
                startActivity(intent);
            }
        });
        btn_Class12Mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class12Activity.this,Class12MathematicsR.class);
                startActivity(intent);
            }
        });
        btn_Class12English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class12Activity.this,Class12EnglishR.class);
                startActivity(intent);
            }
        });
        btn_Class12Bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Class12Activity.this,Class12BioR.class);
                startActivity(intent);
            }
        });



    }
}
