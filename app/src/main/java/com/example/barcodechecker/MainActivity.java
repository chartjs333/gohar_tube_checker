package com.example.barcodechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton put, take, check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        setButtonClickListener();
    }
    private void findViewById() {
        put = findViewById(R.id.put);
        take = findViewById(R.id.take);
        check = findViewById(R.id.check);

    }
    private void setButtonClickListener() {

        put.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Step1Activity.class);
            startActivity(intent);
        });
 check.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CheckTubeActivity.class);
            startActivity(intent);
        });

    }

}