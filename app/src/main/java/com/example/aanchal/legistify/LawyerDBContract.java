package com.example.aanchal.legistify;

import android.provider.BaseColumns;

/**
 * Created by aanchal on 9/10/15.
 */
public class LawyerDBContract implements BaseColumns {

    private LawyerDBContract(){}

    public static final String TABLE_NAME = "Lawyer_DataBase";
    public static final String COLOUMN_NAME="name";
    public static final String COLOUMN_FIELD="field";
    public static final String COLOUMN_CONTACT_NUMBER="contact_number";
    public static final String COLOUMN_ADDRESS="address";
    public static final String COLOUMN_CITY="city";
    public static final String COLOUMN_STATE="state";

}
