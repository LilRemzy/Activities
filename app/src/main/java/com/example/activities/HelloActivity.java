package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        int count = getIntent().getIntExtra("counter", 0);
        TextView counterHello = findViewById(R.id.counterHello);
        counterHello.setText(String.valueOf(count));

        findViewById(R.id.toMainButton).setOnClickListener(v -> goToMain());

        findViewById(R.id.rootHello).setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                goToMain();
            }
        });
    }

    private void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}