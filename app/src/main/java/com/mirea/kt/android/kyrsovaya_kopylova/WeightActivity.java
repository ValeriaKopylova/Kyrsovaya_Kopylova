package com.mirea.kt.android.kyrsovaya_kopylova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class WeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        EditText inputGramm = findViewById(R.id.etGramm);
        EditText inputKilogramm = findViewById(R.id.etKilogr);
        EditText inputCentner = findViewById(R.id.etCenther);
        EditText inputTonna = findViewById(R.id.etTonna);
        EditText inputFunt = findViewById(R.id.etFunt);
        EditText inputYncia = findViewById(R.id.etYnciay);
        EditText inputTYncia = findViewById(R.id.etTYnciay);



        inputGramm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!inputGramm.hasFocus()){
                    String sGramm = inputGramm.getText().toString();
                    if (!sGramm.isEmpty()) {

                        double gramm = Double.parseDouble(sGramm);
                        double kilogram = gramm * 0.001;
                        double centner = gramm * 0.00001;
                        double tonna = gramm * 0.000001;
                        double funt = gramm * 0.0022045;
                        double yncia = gramm * 0.0352733;
                        double tYncia = gramm * 0.03215;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputKilogramm.setText(String.valueOf(kilogram));
                        inputCentner.setText(String.valueOf(centner));
                        inputTonna.setText(String.valueOf(tonna));
                        inputFunt.setText(String.valueOf(funt));
                        inputYncia.setText(String.valueOf(yncia));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputKilogramm.setText("");
                        inputCentner.setText("");
                        inputTonna.setText("");
                        inputFunt.setText("");
                        inputYncia.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });

        inputKilogramm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!inputKilogramm.hasFocus()){
                    String sKilo = inputKilogramm.getText().toString();
                    if (!sKilo.isEmpty()) {


                        double kilo = Double.parseDouble(sKilo);
                        double gramm = kilo * 1000;
                        double centner = gramm * 0.00001;
                        double tonna = gramm * 0.000001;
                        double funt = gramm * 0.0022045;
                        double yncia = gramm * 0.0352733;
                        double tYncia = gramm * 0.03215;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputCentner.setText(String.valueOf(centner));
                        inputTonna.setText(String.valueOf(tonna));
                        inputFunt.setText(String.valueOf(funt));
                        inputYncia.setText(String.valueOf(yncia));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputCentner.setText("");
                        inputTonna.setText("");
                        inputFunt.setText("");
                        inputYncia.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });
        inputCentner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sCentner = inputCentner.getText().toString();
                    if (!sCentner.isEmpty()) {


                        double centner = Double.parseDouble(sCentner);
                        double gramm = centner * 100000;
                        double kilo = gramm * 0.001;
                        double tonna = gramm * 0.000001;
                        double funt = gramm * 0.0022045;
                        double yncia = gramm * 0.0352733;
                        double tYncia = gramm * 0.03215;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputKilogramm.setText(String.valueOf(kilo));
                        inputTonna.setText(String.valueOf(tonna));
                        inputFunt.setText(String.valueOf(funt));
                        inputYncia.setText(String.valueOf(yncia));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputKilogramm.setText("");
                        inputTonna.setText("");
                        inputFunt.setText("");
                        inputYncia.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });

        inputTonna.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sTonna = inputTonna.getText().toString();
                    if (!sTonna.isEmpty()) {


                        double tonna = Double.parseDouble(sTonna);
                        double gramm = tonna * 1000000;
                        double centner = gramm * 0.00001;
                        double funt = gramm * 0.0022045;
                        double yncia = gramm * 0.0352733;
                        double tYncia = gramm * 0.03215;
                        double kilo = gramm * 0.001;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputCentner.setText(String.valueOf(centner));
                        inputKilogramm.setText(String.valueOf(kilo));
                        inputFunt.setText(String.valueOf(funt));
                        inputYncia.setText(String.valueOf(yncia));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputCentner.setText("");
                        inputKilogramm.setText("");
                        inputFunt.setText("");
                        inputYncia.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });
        inputFunt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sFunt = inputFunt.getText().toString();
                    if (!sFunt.isEmpty()) {


                        double funt = Double.parseDouble(sFunt);
                        double gramm = funt * 453.592;
                        double centner = gramm * 0.00001;
                        double yncia = gramm * 0.0352733;
                        double tYncia = gramm * 0.03215;
                        double kilo = gramm * 0.001;
                        double tonna = gramm * 0.000001;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputCentner.setText(String.valueOf(centner));
                        inputKilogramm.setText(String.valueOf(kilo));
                        inputTonna.setText(String.valueOf(tonna));
                        inputYncia.setText(String.valueOf(yncia));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputCentner.setText("");
                        inputKilogramm.setText("");
                        inputTonna.setText("");
                        inputYncia.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });
        inputYncia.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sYncia = inputYncia.getText().toString();
                    if (!sYncia.isEmpty()) {


                        double yncia = Double.parseDouble(sYncia);
                        double gramm = yncia * 28.3495;
                        double centner = gramm * 0.00001;
                        double tYncia = gramm * 0.03215;
                        double kilo = gramm * 0.001;
                        double tonna = gramm * 0.000001;
                        double funt = gramm * 0.0022045;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputCentner.setText(String.valueOf(centner));
                        inputKilogramm.setText(String.valueOf(kilo));
                        inputTonna.setText(String.valueOf(tonna));
                        inputFunt.setText(String.valueOf(funt));
                        inputTYncia.setText(String.valueOf(tYncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputCentner.setText("");
                        inputKilogramm.setText("");
                        inputTonna.setText("");
                        inputFunt.setText("");
                        inputTYncia.setText("");
                    }
                }
            }
        });
        inputTYncia.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!v.hasFocus()){
                    String sYncia = inputTYncia.getText().toString();
                    if (!sYncia.isEmpty()) {


                        double tYncia = Double.parseDouble(sYncia);
                        double gramm = tYncia * 31.1035;
                        double centner = gramm * 0.00001;
                        double kilo = gramm * 0.001;
                        double tonna = gramm * 0.000001;
                        double funt = gramm * 0.0022045;
                        double yncia = gramm * 0.0352733;
                        Log.i("simple_app_tag", "переведо в другие единицы");
                        inputGramm.setText(String.valueOf(gramm));
                        inputCentner.setText(String.valueOf(centner));
                        inputKilogramm.setText(String.valueOf(kilo));
                        inputTonna.setText(String.valueOf(tonna));
                        inputFunt.setText(String.valueOf(funt));
                        inputYncia.setText(String.valueOf(yncia));
                        Log.i("simple_app_tag", "Вывод результатов");
                    } else {
                        inputGramm.setText("");
                        inputCentner.setText("");
                        inputKilogramm.setText("");
                        inputTonna.setText("");
                        inputFunt.setText("");
                        inputYncia.setText("");
                    }
                }
            }
        });
    }






}