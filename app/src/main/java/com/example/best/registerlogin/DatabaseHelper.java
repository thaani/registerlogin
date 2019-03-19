package com.example.best.registerlogin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public  static final String DATABASE_NAME="register.db";
    public  static final String TABLE_NAME="register";
    public  static final String COL_1="id";
    public  static final String COL_2="firstname";
    public  static final String COL_3="lastname";
    public  static final String COL_4="password";
    public  static final String COL_5="email";
    public  static final String COL_6="phone";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE" +TABLE_NAME+ "(id INTEGER PRIMARYKRY AUTOINCREMENT, firstname TEXT, lastname TEXT, password TEXT, email TEXT, phone TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
