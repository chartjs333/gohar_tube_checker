package com.example.barcodechecker;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Done extends AppCompatActivity {
    private MaterialButton done, take, check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done_activity);
        findViewById();
        setButtonClickListener();
    }
    private void findViewById() {
        done = findViewById(R.id.done);
        take = findViewById(R.id.take);
        check = findViewById(R.id.check);

    }
    private void setButtonClickListener() {

        done.setOnClickListener(v -> {
            Intent intent = new Intent(Done.this, Step1Activity.class);
            startActivity(intent);
        });

    }

}