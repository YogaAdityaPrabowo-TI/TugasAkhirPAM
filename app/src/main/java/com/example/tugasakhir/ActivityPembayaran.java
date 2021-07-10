package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;    //fungsi import unutk memanggil activity,menambahkan fungsi,mambaca data string/integer,menampilkan data

public class ActivityPembayaran extends AppCompatActivity {
    EditText txtnmusr,txtnohp,txtsdq;
    Button btnS, btnBT;
    TextView nmusr, nohp, nmpuser; //mendeklarasikan variabel yang di gunkan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        txtnmusr = findViewById(R.id.txtnmusr);
        txtnohp = findViewById(R.id.txtnohp);
        txtsdq = findViewById(R.id.txtsdq);
        btnS = findViewById(R.id.btnS);
        btnBT = findViewById(R.id.btnBT);
        nmusr = findViewById(R.id.nmusr);
        nohp = findViewById(R.id.nohp);
        nmpuser = findViewById(R.id.nmpuser);   //menghubungkan variabel pada button layout xml

        btnBT.setOnClickListener(new View.OnClickListener() { //agar button dapat di klik
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //memindahkan layout ke layout homeactivity
                startActivity(i);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() { //agar button dapat di klik
            @Override
            public void onClick(View v) {
                if (txtnmusr.getText().toString().isEmpty() ||
                        txtnohp.getText().toString().isEmpty() ||
                        txtsdq.getText().toString().isEmpty())  //input yang tidak boleh di kosongkan
                {
                    txtnmusr.setError("Tidak Boleh Kosong");    //memberikan set eror bertulisan tidak boleh kososng
                    txtnohp.setError("Tidak Boleh Kosong"); //memberikan set eror bertulisan tidak boleh kososng
                    txtsdq.setError("Tidak Boleh Kosong");  //memberikan set eror bertulisan tidak boleh kososng
                }else {
                    Toast.makeText(getApplicationContext(),"Shadaqah Yang Anda Berikan Berhasil Terkirim", //membuat veriabel toast bertulisan login sukses
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), End.class); //berpindah layout ke activity End
                    startActivity(i);
                }
            }
        });
    }
}