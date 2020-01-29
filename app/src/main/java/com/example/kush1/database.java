package com.example.kush1;

/*import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import static android.widget.Toast.LENGTH_SHORT;


public class database extends SQLiteOpenHelper {
    private static final String databasename="database1.db";
    private static final String tablename="emp101";
    private static final String col1="id";
    private static final String col2="name";
    private static final String col3="age";
    private static final String col4="designation";




    public database(@Nullable Context context) {
        super(context, databasename, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
   // db.execSQL("create table "+  tablename+ " (" +col1 + " INTEGER primary key AUTOINCREMENT ,"+col2+ " text ,"+col3+" text)");
        db.execSQL("create table " + tablename +   " (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,age TEXT,designation TEXT)");
        //db.execSQL("create table "+  tablename + " ( ID INTEGER PRIMARY KEY AUTOINCREMENT ,name Text ,age Text,designation Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS " +tablename);
       onCreate(db);
    }
    public boolean insertData(String name,String age,String designation)
    { SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cntval=new ContentValues();
        //cntval.put(col1,id);
        cntval.put(col2, name);
        cntval.put(col3, age);
        cntval.put(col4, designation);
       long result= db.insert(tablename,null, cntval);
         if (result== -1){
             return false;
         }
         else
         {
             return true;
         }
    }
}*/


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    private static final String databasename="database2.db";
    private static final String tablename="emp101";
    private static final String col1="id";
    private static final String col2="name";
    private static final String col3="age";
    private static final String col4="designation";

    public database(@Nullable Context context) {
        super(context, databasename, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + tablename +   " (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,age TEXT,designation TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +tablename);
        onCreate(db);

    }
    public boolean insertData(String name,String age,String designation)
    { SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cntval=new ContentValues();
        //cntval.put(col1,id);
        cntval.put(col2, name);
        cntval.put(col3, age);
        cntval.put(col4, designation);
        long result= db.insert(tablename,null, cntval);
        if (result== -1){
            return false;
        }
        else
        {
            return true;
        }
    }
}
