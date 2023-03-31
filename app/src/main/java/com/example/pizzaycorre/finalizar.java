package com.example.pizzaycorre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mUsernameEditText;
    private Spinner mPizzaSpinner;
    private Spinner mBebidaSpinner;
    private Button mFinalizarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = findViewById(R.id.username_edittext);
        mPizzaSpinner = findViewById(R.id.pizza_spinner);
        mBebidaSpinner = findViewById(R.id.bebida_spinner);
        mFinalizarButton = findViewById(R.id.finalizar_button);

        mFinalizarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameEditText.getText().toString();
                String pizzaSeleccionada = mPizzaSpinner.getSelectedItem().toString();
                String bebidaSeleccionada = mBebidaSpinner.getSelectedItem().toString();

                String mensaje = "Estimado " + username + ", has seleccionado la pizza: " + pizzaSeleccionada + " acompañada de la bebida " + bebidaSeleccionada;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }
}