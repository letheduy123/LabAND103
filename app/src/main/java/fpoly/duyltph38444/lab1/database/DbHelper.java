package fpoly.duyltph38444.lab1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public static final int VERSION_NAME=1;
    public static final String TABLE_NAME="SINHVIEN";

    public DbHelper( Context context) {
        super(context, TABLE_NAME, null, VERSION_NAME);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String insert="CREATE TABLE SINHVIEN(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,PRICE INTEGER,ADDRESS TEXT)";
        db.execSQL(insert);
        String sql="INSERT INTO SINHVIEN (ID,NAME,PRICE,ADDRESS) VALUES ('1','Banh mi','1000','Thanh Hoa')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion !=newVersion){
            db.execSQL("DROP TABLE IF EXISTS SINHVIEN ");
            onCreate(db);
        }

    }
}
