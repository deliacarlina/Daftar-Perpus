package com.example.lenovo.daftarperpus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class daftar extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.namaLihat);
        TextView usia = (TextView) findViewById(R.id.usiaLihat);
        TextView alamat = (TextView) findViewById(R.id.alamatLihat);
        TextView email = (TextView) findViewById(R.id.emailLihat);
        //menset nilai dari widget textview
        nama.setText(b.getString("nama"));
        usia.setText(b.getString("usia"));
        alamat.setText(b.getString("alamat"));
        email.setText(b.getString("email"));

    }


}
