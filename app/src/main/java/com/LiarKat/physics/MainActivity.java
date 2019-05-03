package com.LiarKat.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText distancia, tiempo;
    Button cal;
    TextView tvresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distancia = findViewById(R.id.distancia);
        tiempo = findViewById(R.id.tiempo);
        tvresultado = findViewById(R.id.tvresultado);
        cal = findViewById(R.id.cal);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(distancia.getText().toString());
                double valor2 = Double.parseDouble(tiempo.getText().toString());

                double result = valor1 / valor2;

                tvresultado.setText("La velocidad es: " + result + "Km/h");
            }
        });
    }
}
