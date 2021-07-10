package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;   //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

public class End extends AppCompatActivity {
    Button btnAkhir; //mendeklarasikan variabel yang digunakan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        btnAkhir = findViewById(R.id.btnAkhir); //menghubungkan variabel pada button di layout xml

        btnAkhir.setOnClickListener(new View.OnClickListener() { //agar button dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class); //berpindah layout ke MainActivity
                startActivity(i);
            }
        });
    }
}