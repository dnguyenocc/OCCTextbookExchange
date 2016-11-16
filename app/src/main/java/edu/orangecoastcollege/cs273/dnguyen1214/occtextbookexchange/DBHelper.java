package edu.orangecoastcollege.cs273.dnguyen1214.occtextbookexchange;

import android.content.Context;

/**
 * Created by bijanfazeli on 11/15/16.
 */

class DBHelper {
    private Context mContext;

    static final String DATABASE_NAME = "TextBookExchange";
    private static final int DATABASE_VERSION = 1;

    // Define the Fields for Users table.
    private static final String USERS_TABLE = "User";
    private static final String FIELD_BOOKS_DONATED_ID = "bookId", FIELD_BOOKS_BOUGH_ID = "bookId";
    private static final String FIELD_FIRST_NAME = "first_name", FIELD_LAST_NAME = "last_name";
    private static final String FIELD_EMAIL = "email", FIELD_PHONE_NUMBER = "phone";
    private static final String FIELD_PASSWORD = "password", FIELD_RATING = "rating";


}
