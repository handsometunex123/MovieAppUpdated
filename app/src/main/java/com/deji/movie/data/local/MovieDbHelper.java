

package com.deji.movie.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MovieDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "movie.db";

    private static final String TEXT_TYPE = " TEXT";

    private static final String INT_TYPE = " INTEGER";

    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + MovieContract.ContactEntry.TABLE_NAME + " (" +
                    MovieContract.ContactEntry.COLUMN_ID + INT_TYPE + " PRIMARY KEY AUTOINCREMENT," +
                    MovieContract.ContactEntry.COLUMN_MOVIE_ID + TEXT_TYPE + COMMA_SEP +
                    MovieContract.ContactEntry.COLUMN_TITLE + TEXT_TYPE + COMMA_SEP +
                    MovieContract.ContactEntry.COLUMN_POSTER_URL + TEXT_TYPE + COMMA_SEP +
                    MovieContract.ContactEntry.COLUMN_RATING + TEXT_TYPE + COMMA_SEP +
                    MovieContract.ContactEntry.COLUMN_SYNOPSIS + TEXT_TYPE + COMMA_SEP +
                    MovieContract.ContactEntry.COLUMN_RELEASE_DATE + TEXT_TYPE +
                    " )";

    public MovieDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Not required as at version 1
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Not required as at version 1
    }
}
