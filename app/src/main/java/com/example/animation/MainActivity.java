package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1,b2,b3,b4;
    ImageView img;
    Animation ani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        img = findViewById(R.id.img1);


        b1.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
            img.startAnimation(ani);
            t1.startAnimation(ani);

        });

        b2.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
            img.startAnimation(ani);
            t1.startAnimation(ani);
        });
        b3.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            img.startAnimation(ani);
            t1.startAnimation(ani);
        });

        b4.setOnClickListener(view -> {
            ani = AnimationUtils.loadAnimation(this,R.anim.scale);
            img.startAnimation(ani);
            t1.startAnimation(ani);
        });
    }



}