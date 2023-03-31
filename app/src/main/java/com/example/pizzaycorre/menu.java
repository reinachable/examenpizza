package com.example.pizzaycorre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mPizzaButton;
    private Button mBebidasButton;
    private ImageView mPizzaImageView;
    private ImageView mBebidasImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPizzaButton = findViewById(R.id.pizza_button);
        mBebidasButton = findViewById(R.id.bebidas_button);
        mPizzaImageView = findViewById(R.id.pizza_imageview);
        mBebidasImageView = findViewById(R.id.bebidas_imageview);


    }
}