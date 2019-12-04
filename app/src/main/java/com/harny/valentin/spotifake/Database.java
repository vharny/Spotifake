package com.harny.valentin.spotifake;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;

public class Database extends SQLiteOpenHelper {

    public Database(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
        doDBCheck();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.DATABASE_CREATE_TABLE_ALBUM);
        db.execSQL(Constants.INSERT_ALBUM_VALUES);
        db.execSQL(Constants.DATABASE_CREATE_TABLE_TITRE);
        db.execSQL(Constants.INSERT_TITRE_VALUES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void doDBCheck() {
        try {
            File file = new File("data/data/com.harny.valentin.spotifake/databases/" + Constants.DATABASE_NAME);
            file.delete();
        } catch (Exception e) {
            Log.e("VH", "La BDD n'existe pas !");
        }
    }

    public Album[] selectAllAlbums(SQLiteDatabase db) {
        String[] columns = {
                Constants.TABLE_ALBUM_TITRE,
                Constants.TABLE_ALBUM_CREATOR,
                Constants.TABLE_ALBUM_IMAGE
        };

        Cursor cursor = db.query(
                Constants.TABLE_NAME_ALBUM,
                columns,
                null,
                null,
                null,
                null,
                null);
        Album[] albums = new Album[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()) {
            albums[i] = new Album(cursor.getString(cursor.getColumnIndexOrThrow(Constants.TABLE_ALBUM_TITRE)),
                    cursor.getString(cursor.getColumnIndexOrThrow(Constants.TABLE_ALBUM_CREATOR)),
                    cursor.getInt(cursor.getColumnIndexOrThrow(Constants.TABLE_ALBUM_IMAGE)));
            i++;
        }
        cursor.close();

        return albums;
    }

    public Music[] selectMusics(SQLiteDatabase db, int albumPosition) {
        String[] columns = {
                Constants.TABLE_TITRE_TITRE,
                Constants.TABLE_TITRE_AUTHOR,
                Constants.TABLE_TITRE_URL
        };

        String selection = Constants.TABLE_TITRE_ALBUM + " = ?";
        String[] selectionArgs = { String.valueOf(albumPosition) };

        Cursor cursor = db.query(
                Constants.TABLE_NAME_TITRE,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);

        Music[] musics = new Music[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()) {
            musics[i] = new Music(cursor.getString(cursor.getColumnIndexOrThrow(Constants.TABLE_TITRE_TITRE)),
                    cursor.getString(cursor.getColumnIndexOrThrow(Constants.TABLE_TITRE_AUTHOR)),
                    cursor.getString(cursor.getColumnIndexOrThrow(Constants.TABLE_TITRE_URL)));
            i++;
        }

        cursor.close();

        return musics;
    }
}
