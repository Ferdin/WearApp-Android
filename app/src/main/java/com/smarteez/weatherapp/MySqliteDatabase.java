package com.smarteez.weatherapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySqliteDatabase extends SQLiteOpenHelper {

    private static final String database_name = "login.db";

    private String table_name = "log";

    private String column_id = "id";

    private String column_name = "name";

    private String column_password = "password";

    private String create_table_statment = "create table "+table_name+"("+column_id+" integer primary key autoincrement ," + column_name +" text not null ,"+ column_password+" text not null );";

    public MySqliteDatabase(Context context){
        super(context,database_name,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table_statment);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Cursor getAllData(){

        SQLiteDatabase sb = this.getWritableDatabase();

        Cursor res = sb.rawQuery("select * from log;",null);

        return res;
    }

    public Cursor getItemId(String name){
        SQLiteDatabase sb = this.getWritableDatabase();
        String query = "select "+column_name+" from "+table_name+" where "+column_id+" = " + name;
        Cursor res = sb.rawQuery(query,null);

        return res;
    }
}
