package com.mirea.kt.android.kyrsovaya_kopylova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);


        EditText inputKvMetr = findViewById(R.id.kvMetr);
        EditText inputKvKilo = findViewById(R.id.kvKilo);
        EditText inputGektar = findViewById(R.id.gektar);
        EditText inputAcr = findViewById(R.id.acr);

        inputKvMetr.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sKvMetr = inputKvMetr.getText().toString();
                    if (!sKvMetr.isEmpty()) {

                        double kvMetr = Double.parseDouble(sKvMetr);
                        double kvKilo = kvMetr * 0.000001;
                        double gektar = kvMetr * 0.0001;
                        double acr = kvMetr * 0.000247105;
                        Log.i("simple_app_tag", "переведо в другие единицы");

                        inputKvKilo.setText(String.valueOf(kvKilo));
                        inputGektar.setText(String.valueOf(gektar));
                        inputAcr.setText(String.valueOf(acr));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKvKilo.setText("");
                        inputGektar.setText("");
                        inputAcr.setText("");


                    }
                }
            }
        });

        inputKvKilo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sKvKilo = inputKvKilo.getText().toString();
                    if (!sKvKilo.isEmpty()) {

                        double kvKilo = Double.parseDouble(sKvKilo);
                        double kvMetr = kvKilo / 0.000001;
                        double gektar = kvMetr * 0.0001;
                        double acr = kvMetr * 0.000247105;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKvMetr.setText(String.valueOf(kvMetr));
                        inputGektar.setText(String.valueOf(gektar));
                        inputAcr.setText(String.valueOf(acr));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKvMetr.setText("");
                        inputGektar.setText("");
                        inputAcr.setText("");


                    }
                }
            }
        });


        inputGektar.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sGektar = inputGektar.getText().toString();
                    if (!sGektar.isEmpty()) {

                        double gectar = Double.parseDouble(sGektar);
                        double kvMetr = gectar / 0.0001;
                        double kvKilo = kvMetr * 0.000001;
                        double gektar = kvMetr * 0.0001;
                        double acr = kvMetr * 0.000247105;

                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKvKilo.setText(String.valueOf(kvKilo));
                        inputKvMetr.setText(String.valueOf(kvMetr));
                        inputAcr.setText(String.valueOf(acr));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKvKilo.setText("");
                        inputKvMetr.setText("");
                        inputAcr.setText("");


                    }
                }
            }
        });


        inputAcr.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sAcr = inputAcr.getText().toString();
                    if (!sAcr.isEmpty()) {

                        double acr = Double.parseDouble(sAcr);
                        double kvMetr = acr / 0.000247105;
                        double kvKilo = kvMetr * 0.000001;
                        double gektar = kvMetr * 0.0001;

                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKvKilo.setText(String.valueOf(kvKilo));
                        inputGektar.setText(String.valueOf(gektar));
                        inputKvMetr.setText(String.valueOf(kvMetr));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKvKilo.setText("");
                        inputGektar.setText("");
                        inputKvMetr.setText("");


                    }
                }
            }
        });

    }
}