package com.example.lat1_akb2_10116079_purnamaadjie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Daftar extends AppCompatActivity{
    Button btn;
    EditText et_nama,et_umur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        btn = (Button) findViewById(R.id.button_selanjutnya);
        et_nama = (EditText) findViewById(R.id.et_nama);
        et_umur = (EditText) findViewById(R.id.et_umur);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvNama = et_nama.getText().toString();
                String tvUmur = et_umur.getText().toString();

                Intent intent = new Intent(Daftar.this, Beres.class);
                intent.putExtra("nama",tvNama);
                intent.putExtra("umur",tvUmur);
                startActivity(intent);
            }
        });
    }
}
