package com.harny.valentin.spotifake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(@NonNull Context context, int resource, @NonNull Music[] objects) {
        super(context, resource, objects);
    }

    private class MusicHolder {
        public TextView title;
        public TextView author;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.music_cell, parent, false);
        }
        MusicAdapter.MusicHolder musicHolder = new MusicAdapter.MusicHolder();
        musicHolder.title = convertView.findViewById(R.id.titleTextView);
        musicHolder.author = convertView.findViewById(R.id.authorTextView);

        Music music = getItem(position);
        musicHolder.title.setText(music.getTitle());
        musicHolder.author.setText(music.getAuthor());
        return convertView;
    }
}
