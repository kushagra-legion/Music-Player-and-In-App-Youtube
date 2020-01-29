package com.example.kush1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //database db;
   public static final String key="10001";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonclick(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText userpass = (EditText) findViewById(R.id.upass);
        String unam = username.getText().toString();
        String upas = userpass.getText().toString();
        if (unam.equals("alok") && upas.equals("12345")) {
            Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL! WELCOME " + unam, Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(), firstpage.class);
            intent.putExtra(key,unam);
            startActivity(intent);


        } else {
            Toast.makeText(getApplicationContext(), "sorry ! try again.. ", Toast.LENGTH_LONG).show();
        }
    }
}