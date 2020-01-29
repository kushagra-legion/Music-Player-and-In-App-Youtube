package com.example.kush1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class add extends AppCompatActivity {
    database db;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent=getIntent();
        db = new database(getApplicationContext());

    }
    public void submit(View view){
       e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        boolean result1 = db.insertData(e1.getText().toString(),e2.getText().toString(),e3.getText().toString());
        if (result1 == true) {
            Toast.makeText(getApplicationContext(), "data inserted ", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "data not inserted ", Toast.LENGTH_LONG).show();
        }
    }

}
