package com.example.thecore.ahmadbahri_1202150111_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thecore.ahmadbahri_1202150111_modul2.ListMenu;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity {
    private Spinner meja;
    private TextView tampil;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
       meja = (Spinner)findViewById(R.id.spiner);


       ArrayList<String> list = datameja();
       ArrayAdapter<String> adapter = new ArrayAdapter<String>
               (this,android.R.layout.simple_spinner_item,list);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       meja.setAdapter(adapter);


       Button submit = (Button)findViewById(R.id.button2);
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String mejaa=String.valueOf(meja.getSelectedItem());
               TextView name = (TextView)findViewById(R.id.editText);
               tampil= findViewById(R.id.textView3);
               Toast.makeText(getApplicationContext(),mejaa+" "+"Dengan Nama"
                       +name.getText().toString(), Toast.LENGTH_LONG).show();

               startActivity(new Intent(com.example.thecore.ahmadbahri_1202150111_modul2.DineIn.this,ListMenu.class));
               tampil.setText(mejaa);
           }
       });


    }
    public ArrayList<String> datameja(){
        ArrayList<String>isi=new ArrayList<>();
        for(int i=1;i<=10;i++){
            isi.add("Table"+i);}
        return isi;
    }


}
