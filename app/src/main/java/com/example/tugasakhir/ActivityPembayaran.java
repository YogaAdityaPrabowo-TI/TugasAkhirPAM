package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPembayaran extends AppCompatActivity {
    EditText txtnmusr,txtnohp,txtsdq;
    Button btnS, btnBT;
    TextView nmusr, nohp, nmpuser;

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
        nmpuser = findViewById(R.id.nmpuser);

        btnBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtnmusr.getText().toString().isEmpty() ||
                        txtnohp.getText().toString().isEmpty() ||
                        txtsdq.getText().toString().isEmpty())
                {
                    txtnmusr.setError("Tidak Boleh Kosong");
                    txtnohp.setError("Tidak Boleh Kosong");
                    txtsdq.setError("Tidak Boleh Kosong");
                }else {
                    Toast.makeText(getApplicationContext(),"Shadaqah Yang Anda Berikan Berhasil Terkirim",
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), End.class);
                    startActivity(i);
                }
            }
        });
    }
}