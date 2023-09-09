package com.mirea.kt.android.kyrsovaya_kopylova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LenghtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenght);



        EditText inputSm = findViewById(R.id.etSm);
        EditText inputDyim = findViewById(R.id.etDuim);
        EditText inputMetr = findViewById(R.id.etMetr);
        EditText inputKm = findViewById(R.id.etKm);
        EditText inputYard = findViewById(R.id.etYard);
        EditText inputMile = findViewById(R.id.etMila);
        EditText inputSeaMile = findViewById(R.id.etSeaMile);
        EditText inputVersta = findViewById(R.id.etVersta);

        inputSm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sSm = inputSm.getText().toString();
                    if (!sSm.isEmpty()) {


                        double sm = Double.parseDouble(sSm);
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;
                        double yard = sm * 0.01093613888889;
                        double mile = sm * 6;
                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputYard.setText(String.valueOf(yard));
                        inputMile.setText(String.valueOf(mile));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputYard.setText("");
                        inputMile.setText("");
                        inputSeaMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputMetr.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sMetr = inputMetr.getText().toString();
                    if (!sMetr.isEmpty()) {


                        double metr = Double.parseDouble(sMetr);
                        double sm = metr / 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;
                        double yard = sm * 0.01093613888889;
                        double mile = sm * 6;
                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputSm.setText(String.valueOf(sm));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputYard.setText(String.valueOf(yard));
                        inputMile.setText(String.valueOf(mile));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputSm.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputYard.setText("");
                        inputMile.setText("");
                        inputSeaMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputDyim.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sDyim = inputDyim.getText().toString();
                    if (!sDyim.isEmpty()) {


                        double dyim = Double.parseDouble(sDyim);
                        double sm = dyim / 0.393701;
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double yard = sm * 0.01093613888889;
                        double mile = sm * 6;
                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputSm.setText(String.valueOf(sm));
                        inputYard.setText(String.valueOf(yard));
                        inputMile.setText(String.valueOf(mile));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputSm.setText("");
                        inputYard.setText("");
                        inputMile.setText("");
                        inputSeaMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputYard.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sYard = inputYard.getText().toString();
                    if (!sYard.isEmpty()) {


                        double yard = Double.parseDouble(sYard);
                        double sm = yard / 0.01093613888889;
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;

                        double mile = sm * 6;
                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputSm.setText(String.valueOf(sm));
                        inputMile.setText(String.valueOf(mile));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputSm.setText("");
                        inputMile.setText("");
                        inputSeaMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputMile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sMile = inputMile.getText().toString();
                    if (!sMile.isEmpty()) {


                        double mile = Double.parseDouble(sMile);
                        double sm = mile / 6;
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;
                        double yard = sm * 0.01093613888889;

                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputYard.setText(String.valueOf(yard));
                        inputSm.setText(String.valueOf(sm));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputYard.setText("");
                        inputSm.setText("");
                        inputSeaMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputSeaMile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sSeaMile = inputMile.getText().toString();
                    if (!sSeaMile.isEmpty()) {


                        double seaMile = Double.parseDouble(sSeaMile);
                        double sm = seaMile * 185200;
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;
                        double yard = sm * 0.01093613888889;
                        double mile = sm * 6;

                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputYard.setText(String.valueOf(yard));
                        inputSm.setText(String.valueOf(sm));
                        inputMile.setText(String.valueOf(mile));
                        inputVersta.setText(String.valueOf(versta));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputYard.setText("");
                        inputSm.setText("");
                        inputMile.setText("");
                        inputVersta.setText("");
                    }
                }
            }
        });

        inputVersta.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sVersta = inputVersta.getText().toString();
                    if (!sVersta.isEmpty()) {

                        double mile = Double.parseDouble(sVersta);
                        double sm = mile / 6;
                        double metr = sm * 0.01;
                        double km = sm /100000;
                        double duim = sm * 0.393701;
                        double yard = sm * 0.01093613888889;

                        double seaMile = sm / 185200;
                        double versta = sm / 106700;
                        Log.i("simple_app_tag", "переведо в другие единицы");

                        inputMetr.setText(String.valueOf(metr));
                        inputKm.setText(String.valueOf(km));
                        inputDyim.setText(String.valueOf(duim));
                        inputYard.setText(String.valueOf(yard));
                        inputSm.setText(String.valueOf(sm));
                        inputSeaMile.setText(String.valueOf(seaMile));
                        inputMile.setText(String.valueOf(mile));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputMetr.setText("");
                        inputKm.setText("");
                        inputDyim.setText("");
                        inputYard.setText("");
                        inputSm.setText("");
                        inputSeaMile.setText("");
                        inputMile.setText("");
                    }
                }
            }
        });
    }
}