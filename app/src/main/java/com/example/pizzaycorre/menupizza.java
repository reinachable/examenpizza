package com.example.pizzaycorre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mHawaianaButton;
    private Button mPepperoniButton;
    private Button mChampinonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHawaianaButton = findViewById(R.id.hawaiana_button);
        mPepperoniButton = findViewById(R.id.pepperoni_button);
        mChampinonButton = findViewById(R.id.champinon_button);
        mHawaianaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mPepperoniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mChampinonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

    }
}