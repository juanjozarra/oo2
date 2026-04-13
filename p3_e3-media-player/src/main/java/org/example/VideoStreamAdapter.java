package org.example;

public class VideoStreamAdapter implements Media{
    private final VideoStream adaptee;

    public VideoStreamAdapter(VideoStream videoStream) {
        this.adaptee = videoStream;
    }

    @Override
    public String play() {
        return this.adaptee.reproduce();
    }
}
