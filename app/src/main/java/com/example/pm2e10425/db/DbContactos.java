package com.example.pm2e10425.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbContactos extends dbHelper{

    Context context;
    public DbContactos(@Nullable Context context) {
        super(context);
        this.context = context;

    }
    public long insertarContacto(String nombre, int telefono, String nota){
        long id = 0;
        try {
            dbHelper dbHelper = new dbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("telefono", telefono);
            values.put("nota", nota);
            id = db.insert(TABLE_CONTACTOS, null, values);
        } catch (Exception ex)
        {
            ex.toString();
        }
        return id;

    }
}
