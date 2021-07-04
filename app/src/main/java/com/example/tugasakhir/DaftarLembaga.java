package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DaftarLembaga extends AppCompatActivity {

    EditText usr, email, alamat, pwd, repwd;
    Button btnrgs, btnbatal;
    CheckBox pantiasuhan,pantijompo,pesantren;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_lembaga);

        usr = findViewById(R.id.RedtNama);
        email = findViewById(R.id.RedtEmail);
        alamat = findViewById(R.id.RedtAlamat);
        pwd = findViewById(R.id.RedtPassword);
        repwd = findViewById(R.id.RedtrePassword);
        btnrgs = findViewById(R.id.RbtnDaftar);
        btnbatal = findViewById(R.id.RbtnBatal);
        pantiasuhan = findViewById(R.id.checkBox);
        pantijompo = findViewById(R.id.checkBox2);
        pesantren = findViewById(R.id.checkBox3);

        btnrgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        alamat.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty() ||
                        pantiasuhan.getText().toString().isEmpty() ||
                        pantijompo.getText().toString().isEmpty() ||
                        pesantren.getText().toString().isEmpty()) {
                    usr.setError("Masukkan Nama");
                    email.setError("Masukkan Email");
                    alamat.setError("Masukkan Alamat");
                    pwd.setError("Masukkan Password");
                    repwd.setError("Masukkan Re-Password");
                } else {
                    if (pwd.getText().toString().equals(repwd.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}