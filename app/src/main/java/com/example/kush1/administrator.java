package com.example.kush1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class administrator extends AppCompatActivity {
   public static final String key="101";
    String id="1001";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);
        Intent intent=getIntent();
    }
    public void add(View view)
    {
        Intent intent=new Intent(getApplicationContext(), add.class);
        intent.putExtra(key,id);
        startActivity(intent);
    }
}
