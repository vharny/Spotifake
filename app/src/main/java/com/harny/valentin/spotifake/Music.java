package com.harny.valentin.spotifake;
import java.io.Serializable;

public class Music implements Serializable {
    private String title;
    private String author;
    private String youtubeUrl;

    Music(String title, String author, String youtubeUrl) {
        this.title = title;
        this.author = author;
        this.youtubeUrl = youtubeUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYoutubeUrl() {
        return "https://www.youtube.com/watch?v=" + youtubeUrl;
    }
}
