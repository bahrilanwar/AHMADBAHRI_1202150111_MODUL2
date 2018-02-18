package com.example.thecore.ahmadbahri_1202150111_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private Adapter adaptermenu;

    public static ArrayList<Model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new Adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<Model> menuisi() {
        ArrayList<Model> isi = new ArrayList<>();
        isi.add(new Model("Nasi Goreng",18000,R.drawable.warkop_nasgor,"Lengkap dengan Kerupuk + Air Putih"));
        isi.add(new Model("Mie Goreng",15000,R.drawable.warkop_miegoreng,"Lengkap dengan Kerupuk + Air Putih"));
        isi.add(new Model("Mie Rebus",17000,R.drawable.warkop_miekuah,"Lengkap dengan Kerupuk + Air Putih"));
        isi.add(new Model("Roti Bakar",14000,R.drawable.warkop_rotbak,"Variant Rasa: Bluberry, Strawberry, Banana, and Chocolato"));
        isi.add(new Model("Pisang Bakar",13000,R.drawable.warkop_piskar,"Variant Topping: Ceres, Keju, Oreo, dan Susu"));
        isi.add(new Model("Kopi",20000,R.drawable.warkop_kopi,"Kopi Dengan Jenis Kopi Robusta"));
        isi.add(new Model("Cappucino",25000,R.drawable.warkop_cappucino,"Kopi Robusta + Susu"));
        isi.add(new Model("Milkshake",23000,R.drawable.warkop_milkshake,"Variant Rasa: Bluberry, Strawberry, Banana, and Chocolato"));
        return  isi;
    }
}
