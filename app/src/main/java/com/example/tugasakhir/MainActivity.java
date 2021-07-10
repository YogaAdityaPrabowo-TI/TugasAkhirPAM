package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;    //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

public class MainActivity extends AppCompatActivity {
    Button btnmasuk, btndaftar,btnlembaga;
    EditText edemail, edpassword;   //mendeklarasi variabel yang di gunakan

    String nama, password;  //Variabel untuk menyimpan email dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmasuk = findViewById(R.id.btnsignin);    //Menghubungkan Variabel pada button layout yang ada di xml
        edemail = findViewById(R.id.UserName);
        edpassword = findViewById(R.id.password);
        btndaftar = findViewById(R.id.btndaftar);
        btnlembaga = findViewById(R.id.btnlembaga);

        btndaftar.setOnClickListener(new View.OnClickListener() { //agar buton daftar pada layout dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Daftar.class); // untuk memindahkan layout saat di klik pada button Daftar
                startActivity(i);
            }
        });

        btnlembaga.setOnClickListener(new View.OnClickListener() { //agar buton lembaga pada layout dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DaftarLembaga.class); //agar buton lembaga jika di klik dapat masuk ke layout daftar lembaga
                startActivity(i);
            }
        });

        btnmasuk.setOnClickListener(new View.OnClickListener() { //agar buton masuk pada layout dapat di klik
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();    //menyimpan input user variabel nama
                password = edpassword.getText().toString(); //menyimpan input user variabel password
                String email = "bowo"; //untuk mengeset email yang benar
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { //untuk mengeset bahwa email dan password tidak boleh kosong
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);
                    edemail.setError("Email dan Password tidak boleh kosong");  //memberikan set eror bertulisan email dan password tidak boleh kosong
                    edpassword.setError("Email dan Password tidak boleh kosong");
                    t.show();

                } else {
                    //untuk mengecek apakah isi dari email dan password sudah benar
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat veriabel toast bertulisan login sukses
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        //memasukkan value dan beri kunci a dan b
                        // dimasukkan kedalam bundel
                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        //untuk berpindah layout ke layout Lembaga
                        Intent i = new Intent(getApplicationContext(), Lembaga.class);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);

                        //memberikan set eror bertulisan login gagal
                        edemail.setError("Login Gagal");
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
    }
}