package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void startnewActivity(View v) {
        Intent intent = new Intent(activity_about.this, MainActivity.class);
        startActivity(intent);
    }
}