package com.example.thecore.ahmadbahri_1202150111_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    private static int splashInterval = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this,"AHMADBAHRI_1202150111",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(com.example.thecore.ahmadbahri_1202150111_modul2.Splash.this, MainActivity.class);
                startActivity(i);
            }
        }, splashInterval);

    }

    ;
}