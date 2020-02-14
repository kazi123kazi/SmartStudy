package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class11ChemistryR extends AppCompatActivity {
    public Button Class11ChemVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11_chemistry_r);

        Class11ChemVideo=(Button)findViewById(R.id.Class11ChemistryVideo);
        Class11ChemVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Class11ChemistryR.this,Class11ChemVdo.class);
                startActivity(intent);

            }
        });

    }
}
