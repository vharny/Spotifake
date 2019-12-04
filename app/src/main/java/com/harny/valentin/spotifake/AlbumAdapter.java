package com.harny.valentin.spotifake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter(@NonNull Context context, int resource, @NonNull Album[] objects) {
        super(context, resource, objects);
    }

    private class AlbumHolder {
        public TextView name;
        public TextView creator;
        public ImageView img;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_cell, parent, false);
        }
        AlbumHolder albumHolder = new AlbumHolder();
        albumHolder.name = convertView.findViewById(R.id.albumName);
        albumHolder.creator = convertView.findViewById(R.id.creatorName);
        albumHolder.img = convertView.findViewById(R.id.imageView);

        Album album = getItem(position);
        albumHolder.name.setText(album.getName());
        albumHolder.creator.setText(album.getCreator());
        albumHolder.img.setImageResource(album.getImage());
        return convertView;
    }
}
