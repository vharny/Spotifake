package com.harny.valentin.spotifake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    ListView listView;
    TextView albumName;
    TextView creatorName;
    ImageView image;
    Music[] listOfMusics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        listView = findViewById(R.id.listView);
        albumName = findViewById(R.id.albumName);
        creatorName = findViewById(R.id.creatorName);
        image = findViewById(R.id.imageView);

        albumName.setText(getIntent().getStringExtra("name"));
        image.setImageResource(getIntent().getIntExtra("image", 0));
        creatorName.setText((creatorName.getText() + getIntent().getStringExtra("creator")));

        listOfMusics = (Music[]) getIntent().getSerializableExtra("musics");

        MusicAdapter musicAdapter = new MusicAdapter(this, 0, listOfMusics);
        listView.setAdapter(musicAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(listView.getContext(), webActivity.class);
                intent.putExtra("url", listOfMusics[position].getYoutubeUrl());
                startActivity(intent);
            }
        });
    }
}
