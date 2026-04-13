package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MediaPlayerTest {

    @Test
    void playDelegatesToAudio() {
        MediaPlayer player = new MediaPlayer(new Audio());
        assertEquals("Playing audio", player.play());
    }

    @Test
    void playDelegatesToVideoFile() {
        MediaPlayer player = new MediaPlayer(new VideoFile());
        assertEquals("Playing video file", player.play());
    }

    @Test
    void playDelegatesToVideoStreamAdapter() {
        VideoStream stream = new VideoStream();
        MediaPlayer player = new MediaPlayer(new VideoStreamAdapter(stream));
        assertEquals("Playing video stream", player.play());
    }

    @Test
    void setMediaFromAudioToVideoFilePlayUsesNewMedia() {
        MediaPlayer player = new MediaPlayer(new Audio());
        assertEquals("Playing audio", player.play());

        player.setMedia(new VideoFile());
        assertEquals("Playing video file", player.play());
    }

    @Test
    void setMediaFromVideoFileToVideoStreamAdapterPlayUsesNewMedia() {
        MediaPlayer player = new MediaPlayer(new VideoFile());
        assertEquals("Playing video file", player.play());

        player.setMedia(new VideoStreamAdapter(new VideoStream()));
        assertEquals("Playing video stream", player.play());
    }

    @Test
    void setMediaMultipleTimesEachPlayUsesCurrentMedia() {
        MediaPlayer player = new MediaPlayer(new Audio());
        assertEquals("Playing audio", player.play());

        player.setMedia(new VideoFile());
        assertEquals("Playing video file", player.play());

        player.setMedia(new VideoStreamAdapter(new VideoStream()));
        assertEquals("Playing video stream", player.play());

        player.setMedia(new Audio());
        assertEquals("Playing audio", player.play());
    }
}
