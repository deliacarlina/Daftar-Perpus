package com.example.lenovo.daftarperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TableLayout;

public class  MainActivity  extends AppCompatActivity implements View.OnClickListener {

    //mendeklarasikan variabel

    EditText nama;
    EditText usia;
    EditText alamat;
    EditText email;
    Button button;
    Button buttonsatu;
    TableLayout tableLayout;

    /** memanggil activity pertama dibuat*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = getIntent().getExtras();

        //Menampilkan semua tampilan id
        findAllViewsId();

        button.setOnClickListener(this);
        buttonsatu.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.daftar);
        nama= (EditText) findViewById(R.id.nama);
        usia = (EditText) findViewById(R.id.usia);
        alamat = (EditText) findViewById(R.id.alamat);
        email= (EditText) findViewById(R.id.email);
        buttonsatu = (Button) findViewById(R.id.daftarbuku);
        tableLayout = (TableLayout) findViewById(R.id.tablelayoutid);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.daftar:
                intent = new Intent(getApplicationContext(), daftar.class);
                //Membuat obyek bundle
                Bundle b = new Bundle();

                //Menyisipkan tipe data String ke dalam obyek bundle
                b.putString("nama", nama.getText().toString());
                b.putString("usia", usia.getText().toString());
                b.putString("alamat", alamat.getText().toString());
                b.putString("email", email.getText().toString());


                //Menambahkan bundle intent
                intent.putExtras(b);

                //memulai Activity kedua
                startActivity(intent);
                break;
            case R.id.daftarbuku:
                intent = new Intent(getApplicationContext(), buku.class);
                //memulai Activity kedua
                startActivity(intent);
                break;
        }
    }
}



