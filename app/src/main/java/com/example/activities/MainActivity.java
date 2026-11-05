package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counter = findViewById(R.id.counter);
        Button countButton = findViewById(R.id.countButton);
        Button helloButton = findViewById(R.id.helloButton);
        Button thirdButton = findViewById(R.id.thirdButton);

        countButton.setOnClickListener(v -> {
            count++;
            counter.setText(String.valueOf(count));
        });

        helloButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelloActivity.class);
            intent.putExtra("counter", count);
            startActivity(intent);
        });

        thirdButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("counter", count);
            startActivity(intent);
        });

    }
}