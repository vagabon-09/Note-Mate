package com.example.notemate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


@SuppressLint("CustomSplashScreen")
public class SplashActivityOne extends AppCompatActivity {
    AppCompatButton startBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_one);
        //Finding all views in this function
        findingView();
        //Performing action when clicking buttons
        clickingBtn();

    }

    private void clickingBtn() {
        startBtn.setOnClickListener(v -> {
            Intent i = new Intent(this, SplashActivityTwo.class);
            startActivity(i);
            finish();
        });
    }

    private void findingView() {
        startBtn = findViewById(R.id.getStartBtn);
    }
}