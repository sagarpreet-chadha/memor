package sagarpreet97.reminder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sagarpreet chadha on 04-12-2016.
 */
public class FAQ_DataBaseHelper extends SQLiteOpenHelper {

    public static final String DB_TABLE = "faq";
    public static final String KEY_TITLE = "title";

    public  static final String KEY_DESC = "desc";

    public FAQ_DataBaseHelper(Context context) {
        super(context, "CNCN",  null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +  DB_TABLE + " ( " + KEY_TITLE + " TEXT ," +
                KEY_DESC  + " TEXT);");
        // db.execSQL("create table students ( _ID INTEGER PRIMARY KEY ," +
        //          " batch_id INTEGER, name TEXT, college TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
