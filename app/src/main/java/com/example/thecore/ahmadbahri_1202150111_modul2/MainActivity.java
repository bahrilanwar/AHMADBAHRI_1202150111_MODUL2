package com.example.thecore.ahmadbahri_1202150111_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.thecore.ahmadbahri_1202150111_modul2.DineIn;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup piihradio = (RadioGroup) findViewById(R.id.radioGroup);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int R_pilihradio = piihradio.getCheckedRadioButtonId();
                switch (R_pilihradio){
                    case R.id.radioButton2:
                        startActivity(new Intent(MainActivity.this, com.example.thecore.ahmadbahri_1202150111_modul2.TakeAway.class));
                        break;
                    default:
                        startActivity(new Intent(MainActivity.this,DineIn.class));
                        break;

                }
            }
        });
    }
}
