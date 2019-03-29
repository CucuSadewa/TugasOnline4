package com.example.tugasonline4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private Button btnSoal;
    private EditText edtNama, edtNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        edtNim  = (EditText)findViewById(R.id.edt_nim);
        edtNama = (EditText)findViewById(R.id.edt_nama);
        btnSoal = (Button)findViewById(R.id.btn_soal);
    }
public void soal(View view){

            String Nim = edtNim.getText().toString().trim();
        String Nama = edtNama.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(Nim)) {
            isEmptyFields = true;
            edtNim.setError("Fields Ini Tidak Boleh Kosong!");
        }
        if (TextUtils.isEmpty(Nama)) {
            isEmptyFields = true;
            edtNama.setError("Fields Ini Tidak Boleh Kosong!");
        } if (!isEmptyFields){

    Intent intentSoal = new Intent(HomeActivity.this,SoalActivity.class);
    startActivity(intentSoal);
    Toast.makeText(getApplicationContext(), "Silahkan Isi Sola Berikut",Toast.LENGTH_SHORT).show();
}
}}
