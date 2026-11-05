package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        count = getIntent().getIntExtra("counter", 0);
        TextView counterThird = findViewById(R.id.counterThird);
        counterThird.setText(String.valueOf(count));

        findViewById(R.id.toMainButton).setOnClickListener(v -> goToMain());
        findViewById(R.id.toHelloButton).setOnClickListener(v -> goToHello());

        findViewById(R.id.rootThird).setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                goToMain();
            }

            @Override
            public void onSwipeRight() {
                goToHello();
            }
        });
    }

    private void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void goToHello() {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("counter", count);
        startActivity(intent);
    }
}