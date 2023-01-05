package com.example.sjcet.exam2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {
    public MyDatabase(Context context){
        super(context,"Login.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER(NAME text,SURNAME text, MARK integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table USER ");

    }
    public boolean insert(String userval, String surval, Integer passval) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        //contentValues.get("Name",userval);
        //contentValues.get("Surname",surval);
        //contentValues.get("Mark", passval);
        long result = db.insert("USER",null,contentValues);
        return true;



    }


    public boolean delete(String userval) {
        SQLiteDatabase db=this.getWritableDatabase();
        //int delete=db.delete("Users","Name=?"[userval]{new String});
        return true;
    }


}
