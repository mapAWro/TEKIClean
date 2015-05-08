package com.doomsay.zig;

import java.text.SimpleDateFormat;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class Account {


    public static final String LOGIN_FIELD_NAME = "login";
    public static final String PASSWORD_FIELD_NAME = "password";

    @DatabaseField(generatedId = true)
    int id;
    @DatabaseField(index = true)
    String string;
    @DatabaseField(canBeNull = false, columnName = PASSWORD_FIELD_NAME)
    private String password;
    @DatabaseField(canBeNull = false, columnName = LOGIN_FIELD_NAME)
    private String login;


    public Account() {
        //needed by ormlite
    }
}


