package com.harny.valentin.spotifake;

public class Album {
    private String name;
    private String creator;
    private int img;

    Album(String name, String creator, int img){
        this.name = name;
        this.creator = creator;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getCreator() { return creator; }

    public int getImage() {
        return img;
    }
}
