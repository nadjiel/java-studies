package dev.java_studies.my_phone.main;

public class MusicPlayer {

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void play() {
        if(song == null) {
            throw new UnsupportedOperationException("Can't play unselected song!");
        }

        System.out.println("Playing " + song + "...");
    }

    public void pause() {
        if(song == null) {
            throw new UnsupportedOperationException("Can't pause unselected song!");
        }

        System.out.println("Paused " + song + ".");
    }

    public void selectSong(String songName) {
        setSong(songName);
    }

}
