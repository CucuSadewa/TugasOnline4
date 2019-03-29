package com.example.tugasonline4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername = (EditText)findViewById(R.id.edt_usename);
        edtPassword = (EditText)findViewById(R.id.edt_pwd);
        btnLogin    = (Button)findViewById(R.id.btn_login);

    }
    public void masuk(View v){
        String usernameKey = edtUsername.getText().toString();
        String passwordKey = edtPassword.getText().toString();

        if (usernameKey.equals("admin") && passwordKey.equals("1234")){
            Toast.makeText(getApplicationContext(),"Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intentMasuk = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intentMasuk);
        }else {
            Toast.makeText(getApplicationContext(),"Login Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}
