package com.mirea.kt.android.kyrsovaya_kopylova;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SpeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        EditText inputMetr = findViewById(R.id.etMetrSec);
        EditText inputKmH = findViewById(R.id.kmChas);
        EditText inputKmS = findViewById(R.id.kmSec);

        inputMetr.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sMetr = inputMetr.getText().toString();
                    if (!sMetr.isEmpty()) {

                        double metr = Double.parseDouble(sMetr);
                        double kmH = metr * 0.277778;
                        double kmS = metr / 1000;

                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKmH.setText(String.valueOf(kmH));
                        inputKmS.setText(String.valueOf(kmS));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKmH.setText("");
                        inputKmS.setText("");

                    }
                }
            }
        });

        inputKmH.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sKmH = inputKmH.getText().toString();
                    if (!sKmH.isEmpty()) {

                        double kmH = Double.parseDouble(sKmH);
                        double metr = kmH * 3.6;
                        double kmS = metr / 1000;

                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKmS.setText(String.valueOf(kmS));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputMetr.setText("");
                        inputKmS.setText("");

                    }
                }
            }
        });

        inputKmS.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sKmS = inputKmS.getText().toString();
                    if (!sKmS.isEmpty()) {

                        double kMs = Double.parseDouble(sKmS);
                        double metr = kMs * 1000;
                        double kmH = metr * 0.277778;

                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKmH.setText(String.valueOf(kmH));
                        inputMetr.setText(String.valueOf(metr));
                        Log.i("simple_app_tag", "Вывод результатов");

                    } else {
                        inputKmH.setText("");
                        inputMetr.setText("");

                    }
                }
            }
        });

    }
}