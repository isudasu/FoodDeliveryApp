package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DeliveryDbHelper extends SQLiteOpenHelper {
    public static final String DETAILS_NAME = "Details.db";
    public static final String DETAILS_TABLE = "Details_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "ADDRESS";
    public static final String COL_3 = "BUILDING";
    public static final String COL_4 = "FLOOR";
    public static final String COL_5 = "STREET";
    public static final String COL_6 = "AREA";
    public static final String COL_7 = "VEHICLE";
    public static final String COL_8 = "DELIVERY";
    public static final String COL_9 = "SPECIAL";

    public DeliveryDbHelper(@Nullable Context context) {
        super(context, DETAILS_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+DETAILS_TABLE+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, ADDRESS TEXT, BUILDING TEXT, FLOOR INTEGER, STREET INTEGER, AREA TEXT," +
                "VEHICLE TEXT, DELIVERY TEXT, SPECIAL TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
         db.execSQL("DROP TABLE IF EXISTS "+DETAILS_TABLE);
         onCreate(db);
    }

    public boolean insertData(String address, String building, String floor, String street, String area, String vehicle, String delivery, String special){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, address);
        contentValues.put(COL_3, building);
        contentValues.put(COL_4, floor);
        contentValues.put(COL_5, street);
        contentValues.put(COL_6, area);
        contentValues.put(COL_7, vehicle);
        contentValues.put(COL_8, delivery);
        contentValues.put(COL_9, special);
        long result = db.insert(DETAILS_TABLE, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+DETAILS_TABLE,null );
        return res;
    }

    public boolean updateData(String id, String address, String building, String floor, String street, String area, String vehicle, String delivery, String special){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, address);
        contentValues.put(COL_3, building);
        contentValues.put(COL_4, floor);
        contentValues.put(COL_5, street);
        contentValues.put(COL_6, area);
        contentValues.put(COL_7, vehicle);
        contentValues.put(COL_8, delivery);
        contentValues.put(COL_9, special);
        db.update(DETAILS_TABLE, contentValues, "ID=?", new String[]{id});
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(DETAILS_TABLE,"ID = ?", new String[] {id});
    }
}
