package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.imageslider.Prevalent.Prevalent;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
    SliderView sliderView;
    TextView userNameText;
    private Button btn_class_11,btn_class_12,btn_class_jee,btn_class_neet,btn_class_test,btn_class_faq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.imageSlider);
        btn_class_11=(Button)findViewById(R.id.buttonClass11);
        btn_class_12=(Button)findViewById(R.id.buttonClass12);
        btn_class_jee=(Button)findViewById(R.id.buttonNEET);
        btn_class_neet=(Button)findViewById(R.id.buttonJEE);
        btn_class_test=(Button)findViewById(R.id.buttonTEST);
        btn_class_faq=(Button)findViewById(R.id.buttonFAQ);
        userNameText=(TextView)findViewById(R.id.userNameText);

        final SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.setCount(5);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });
        Log.i("SEE2","reach here");


        userNameText.setText("Welcome "+Prevalent.currentOnlineUser.getName());

        btn_class_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Class11Activity.class);
                startActivity(intent);
            }
        });
        btn_class_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Class12Activity.class);
                startActivity(intent);
            }
        });
        btn_class_jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClassJEEActivity.class);
                startActivity(intent);
            }
        });
        btn_class_neet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClassNEETActivity.class);
                startActivity(intent);
            }
        });
        btn_class_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClassTESTActivity.class);
                startActivity(intent);
            }
        });
        btn_class_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClassFAQActivity.class);
                startActivity(intent);
            }
        });













    }
}
