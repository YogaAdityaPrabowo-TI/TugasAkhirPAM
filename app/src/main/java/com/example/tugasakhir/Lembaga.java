package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;   //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

public class Lembaga extends AppCompatActivity {
    Button btnbayunglencir,btnrumahyatim,btnnurulsyamsi; //mendeklarasikan variabel yang di gunakan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembaga);

        btnbayunglencir = findViewById(R.id.btnbayunglencir);
        btnnurulsyamsi = findViewById(R.id.btnnurulsyamsi);
        btnrumahyatim = findViewById(R.id.btnrumahyatim);   //menguhunungkan variabel pada button layout xml

        btnbayunglencir.setOnClickListener(new View.OnClickListener() { //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //berpindah layout ke Home Activity
                startActivity(i);
            }
        });

        btnnurulsyamsi.setOnClickListener(new View.OnClickListener() {  //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //berpindah layout ke Home Activity
                startActivity(i);
            }
        });

        btnrumahyatim.setOnClickListener(new View.OnClickListener() {   //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //berpindah layout ke Home Activity
                startActivity(i);
            }
        });
    }
}