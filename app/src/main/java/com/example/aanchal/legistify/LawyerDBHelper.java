package com.example.aanchal.legistify;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aanchal on 9/10/15.
 */
public class LawyerDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 10;
    public static final String DATABASE_NAME = "LawyerDB.db";

    public LawyerDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE Lawyer_DataBase ("
                + LawyerDBContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + LawyerDBContract.COLOUMN_NAME + " TEXT, "
                + LawyerDBContract.COLOUMN_FIELD + " TEXT, "
                + LawyerDBContract.COLOUMN_CONTACT_NUMBER + " TEXT, "
                + LawyerDBContract.COLOUMN_ADDRESS + " TEXT, "
                + LawyerDBContract.COLOUMN_CITY + " TEXT, "
                + LawyerDBContract.COLOUMN_STATE + " TEXT ); "
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
