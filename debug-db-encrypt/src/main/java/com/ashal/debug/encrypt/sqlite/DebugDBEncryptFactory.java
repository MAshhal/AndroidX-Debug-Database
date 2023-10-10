package com.ashal.debug.encrypt.sqlite;

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import com.ashal.sqlite.DBFactory;
import com.ashal.sqlite.SQLiteDB;


public class DebugDBEncryptFactory implements DBFactory {

    @Override
    public SQLiteDB create(Context context, String path, String password) {
        SQLiteDatabase.loadLibs(context);
        return new DebugEncryptSQLiteDB(SQLiteDatabase.openOrCreateDatabase(path, password, null));
    }

}
