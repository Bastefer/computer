package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityMath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }
    public void toOrderFromOrderMath(View v) {
        Intent intent = new Intent(ActivityMath.this, orderActivity.class);
        startActivity(intent);
    }
}