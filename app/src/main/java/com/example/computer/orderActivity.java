package com.example.computer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Spinner spinner = findViewById(R.id.spinner_main);

        // Создаем список элементов для выпадающего списка
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Самовывоз");
        arrayList.add("Курьер");
        arrayList.add("Почта России");

        // Создаем адаптер для выпадающего списка
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Устанавливаем адаптер для выпадающего списка
        spinner.setAdapter(adapter);

        // Устанавливаем слушатель для обработки выбора элемента
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(orderActivity.this, "Selected Item: " + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Можно добавить обработку, если ничего не выбрано
            }
        });
    }

    public void toMainFromOrder(View v) {
        Intent intent = new Intent(orderActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void toOrderFromOrder(View v) {
        Intent intent = new Intent(orderActivity.this, OrderActivitySucsses.class);
        startActivity(intent);
    }


}