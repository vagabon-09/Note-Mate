package com.example.notemate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class starapp extends AppCompatActivity {

    AppCompatButton btn=findViewById(R.id.f2btn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starapp);

        Intent inext;
        inext=new Intent(starapp.this, loginpage.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(inext);
            }
        });
    }
}