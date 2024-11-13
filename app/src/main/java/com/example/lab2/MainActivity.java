package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();

        findViewById(R.id.button1).setOnClickListener((l) -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        findViewById(R.id.button2).setOnClickListener((l) -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

        findViewById(R.id.button3).setOnClickListener((l) -> {
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        });

        findViewById(R.id.button4).setOnClickListener((l) -> {
            finish();
        });
    }
}