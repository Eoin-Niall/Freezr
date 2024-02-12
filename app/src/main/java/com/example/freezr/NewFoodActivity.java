package com.example.freezr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class NewFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_food);

        Button button1 = findViewById(R.id.formSubmitButton);
        button1.setOnClickListener(view -> setContentView(R.layout.activity_submitted));
    }
}