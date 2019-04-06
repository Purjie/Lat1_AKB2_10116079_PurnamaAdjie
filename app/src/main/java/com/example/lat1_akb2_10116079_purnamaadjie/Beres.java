package com.example.lat1_akb2_10116079_purnamaadjie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Beres extends AppCompatActivity {

    TextView tvNama, tvUmur, tvFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beres);

        tvFinish = (TextView) findViewById(R.id.tv_finish);
        tvNama = (TextView) findViewById(R.id.nama_finish);
        tvUmur = (TextView) findViewById(R.id.umur_finish);

        tvFinish.setText("Beres! Sekarang " + getIntent().getStringExtra("nama") + "\nudah bisa ngecek\nPenggunaan HP mu\ntiap hari buat bantu " + getIntent().getStringExtra("umur") + "\nngatur waktu :)");
        tvNama.setText("Nama = " + getIntent().getStringExtra("nama"));
        tvUmur.setText("Umur = " + getIntent().getStringExtra("umur") + " Tahun");

    }
}
