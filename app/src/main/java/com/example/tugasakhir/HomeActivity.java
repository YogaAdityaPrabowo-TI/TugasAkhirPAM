package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;   //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

public class HomeActivity extends AppCompatActivity {
    Button btngopay,btndana,btnovo,btntf,btnlink;   //mendeklarasikan variabel yang di gunakan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btngopay = findViewById(R.id.btnbayunglencir);
        btndana = findViewById(R.id.btnnurulsyamsi);
        btnovo = findViewById(R.id.btnovo);
        btntf = findViewById(R.id.btnrumahyatim);
        btnlink = findViewById(R.id.btnlink);   //berfungsi menghubungkan dengan button yang di gunakan pada layout xml

        btngopay.setOnClickListener(new View.OnClickListener() {    //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPembayaran.class); //berpindah layout ke layout class
                startActivity(i);
            }
        });

        btndana.setOnClickListener(new View.OnClickListener() { //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPembayaran.class);   //berpindah layout ke layout class
                startActivity(i);
            }
        });

        btnovo.setOnClickListener(new View.OnClickListener() {  //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPembayaran.class);   //berpindah layout ke layout class
                startActivity(i);
            }
        });

        btntf.setOnClickListener(new View.OnClickListener() {   //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPembayaran.class);   //berpindah layout ke layout class
                startActivity(i);
            }
        });

        btnlink.setOnClickListener(new View.OnClickListener() { //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityPembayaran.class);   //berpindah layout ke layout class
                startActivity(i);
            }
        });
    }
}