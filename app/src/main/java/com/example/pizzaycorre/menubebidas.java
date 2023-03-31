package com.example.pizzaycorre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button mCocaColaButton;
        private Button mBonafontButton;
        private Button mAguaButton;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                mCocaColaButton = findViewById(R.id.cocacola_button);
                mBonafontButton = findViewById(R.id.bonafont_button);
                mAguaButton = findViewById(R.id.agua_button);
                mCocaColaButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                });
                mBonafontButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                });
                mAguaButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }