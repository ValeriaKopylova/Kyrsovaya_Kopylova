package com.mirea.kt.android.kyrsovaya_kopylova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageView imageWeigth = findViewById(R.id.imageWeight);
        ImageView imageLength = findViewById(R.id.imageLenght);
        ImageView imageSquare = findViewById(R.id.imageSquare);
        ImageView imageSpeed = findViewById(R.id.imageSpeed);

        imageWeigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actIntent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(actIntent);
                Log.i("simple_app_tag", "Переход в WeightActivity");
            }
        });

        imageLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actIntent = new Intent(getApplicationContext(), LenghtActivity.class);
                startActivity(actIntent);
                Log.i("simple_app_tag", "Переход в LenghtActivity");
            }
        });

        imageSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actIntent = new Intent(getApplicationContext(), SquareActivity.class);
                startActivity(actIntent);
                Log.i("simple_app_tag", "Переход в SquareActivity");
            }
        });

        imageSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actIntent = new Intent(getApplicationContext(), SpeedActivity.class);
                startActivity(actIntent);
                Log.i("simple_app_tag", "Переход в SpeedActivity");
            }
        });

    }


    @Override
    public void onClick(View v) {


    }
}