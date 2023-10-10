package com.ashal.debug.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.ashal.sqlite.DBFactory;
import com.ashal.sqlite.SQLiteDB;

public class DebugDBFactory implements DBFactory {

    @Override
    public SQLiteDB create(Context context, String path, String password) {
        return new DebugSQLiteDB(SQLiteDatabase.openOrCreateDatabase(path, null));
    }

}
