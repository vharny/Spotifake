package com.harny.valentin.spotifake;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    LinearLayout splashScreen;
    LinearLayout mainLayout;
    ListView listView;
    Album[] listOfAlbums;
    Music[] listOfMusics;
    Database database;
    boolean splashScreenShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashScreenShow = true;
        splashScreen = findViewById(R.id.splashScreen);
        mainLayout = findViewById(R.id.mainLayout);
        listView = findViewById(R.id.listView);

        database = new Database(this);
        final SQLiteDatabase db = database.getWritableDatabase();
        listOfAlbums = database.selectAllAlbums(db);

        // SplashScreen
        if (splashScreenShow) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    splashScreen.setVisibility(View.GONE);
                }
            }, 2000);
            splashScreenShow = false;
        }

        AlbumAdapter albumAdapter = new AlbumAdapter(this, 0, listOfAlbums);
        listView.setAdapter(albumAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listOfMusics = database.selectMusics(db, position+1);
                Intent playlistIntent = new Intent(listView.getContext(), PlaylistActivity.class);
                playlistIntent.putExtra("musics", listOfMusics);
                playlistIntent.putExtra("image", listOfAlbums[position].getImage());
                playlistIntent.putExtra("name", listOfAlbums[position].getName());
                playlistIntent.putExtra("creator", listOfAlbums[position].getCreator());
                startActivity(playlistIntent);
            }
        });
    }

}
