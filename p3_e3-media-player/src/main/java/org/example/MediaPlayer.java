package org.example;

public class MediaPlayer {
    private Media media;

    public MediaPlayer(Media media) {
        this.media = media;
    }

    public String play() {
        return this.media.play();
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
