package com.example.barcodechecker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class CheckTubeActivity extends AppCompatActivity {
    private MaterialButton testTubeStatus;
    private TextView status, id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_tube_activity);
        findViewById();
        setButtonClickListener();
    }

    private void findViewById() {
        testTubeStatus = findViewById(R.id.checkTube);
        status = findViewById(R.id.status);
        id = findViewById(R.id.id);

    }

    private void setButtonClickListener() {

        testTubeStatus.setOnClickListener(v -> {
            startBarcodeScanner();
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() != null) {
                status.setText("EXTRACTED");
                id.setText(result.getContents());
            } else {
                // Barcode scanning was canceled or failed
            }
        }
    }

    private void startBarcodeScanner() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setOrientationLocked(false);
        integrator.setPrompt("Scan a barcode");
        integrator.initiateScan();
    }
}