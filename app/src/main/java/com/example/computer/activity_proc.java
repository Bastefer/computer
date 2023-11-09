package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_proc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proc);
    }
    public void startActivity(View v) {
        Intent intent = new Intent(activity_proc.this, MainActivity.class);
        startActivity(intent);
    }
    public void toOrder(View v) {
        Intent intent = new Intent(activity_proc.this, orderActivity.class);
        startActivity(intent);
    }
}