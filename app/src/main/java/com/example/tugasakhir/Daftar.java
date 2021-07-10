package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;    //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

import com.google.android.material.snackbar.Snackbar;

public class Daftar extends AppCompatActivity {

    EditText usr, email, alamat, pwd, repwd;    //deklarasi variabel
    Button btnrgs, btnbatal;
    CheckBox jenisklm, agama,lembaga;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        usr = findViewById(R.id.RedtNama);
        email = findViewById(R.id.RedtEmail);
        alamat = findViewById(R.id.RedtAlamat);
        pwd = findViewById(R.id.RedtPassword);
        repwd = findViewById(R.id.RedtrePassword);
        btnrgs = findViewById(R.id.RbtnDaftar);
        btnbatal = findViewById(R.id.RbtnBatal);
        jenisklm = findViewById(R.id.checkBox);
        jenisklm = findViewById(R.id.checkBox2);
        lembaga = findViewById(R.id.checkBox3); //menghubungkan variabel pada button di layout

        btnrgs.setOnClickListener(new View.OnClickListener() {  //agar buton dapat di klik
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() ||   //input yang tidak boleh kosong
                        email.getText().toString().isEmpty() ||
                        alamat.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty() ||
                        jenisklm.getText().toString().isEmpty() ||
                        lembaga.getText().toString().isEmpty() ||
                        agama.getText().toString().isEmpty()) {
                    usr.setError("Masukkan Nama");  //memberikan set eror bertulisan masukkan nama
                    email.setError("Masukkan Email");   //memberikan set eror bertulisan masukkan email
                    alamat.setError("Masukkan Alamat"); //memberikan set eror bertulisan masukkan alamat
                    pwd.setError("Masukkan Password");  //memberikan set eror bertulisan masukkan password
                    repwd.setError("Masukkan Re-Password"); //memberikan set eror bertulisan masukkan repassword
                } else {
                    if (pwd.getText().toString().equals(repwd.getText().toString())) {  //untuk mengecek apakah isi dari password dan re password sudah sama
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same", //untuk menampilkan snackbar password and repassword harus sama
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnbatal.setOnClickListener(new View.OnClickListener() {    //agar buton dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); //berpindah layout ke layout class
                startActivity(i);
            }
        });

    }
}