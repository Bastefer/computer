package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import kotlin.Suppress;

public class OrderActivitySucsses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_sucsses);

        
    }
    public void toMainFromOrderSucss(View v) {
        Intent intent = new Intent(OrderActivitySucsses.this, MainActivity.class);
        startActivity(intent);
    }
}