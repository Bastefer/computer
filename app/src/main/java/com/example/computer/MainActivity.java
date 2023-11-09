package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startnewActivityPros(View v) {
        Intent intent = new Intent(MainActivity.this, activity_proc.class);
        startActivity(intent);
    }
    public void startnewActivityMath(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityMath.class);
        startActivity(intent);
    }
    public void startnewActivityVideo(View v) {
        Intent intent = new Intent(MainActivity.this, activity_video.class);
        startActivity(intent);
    }
    public void startnewActivityAbout(View v) {
        Intent intent = new Intent(MainActivity.this, activity_about.class);
        startActivity(intent);
    }



}

