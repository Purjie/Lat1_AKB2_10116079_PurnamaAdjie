package com.example.lat1_akb2_10116079_purnamaadjie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*4 April
6.36 layout beranda
18.21 layout login

5 April
13.20 layout daftar
14.10 layout beres

6 April
13.30 menambahkan intent button setiap dilayout
18.15 aplikasi selesai


 */
public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.berandalayout);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bt = new Intent(Beranda.this, Login.class);
                startActivity(bt);
            }
        });
    }
}
