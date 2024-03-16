/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managemusic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaron
 */
public class Playlist {
    private List<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public List<String> getSongs() {
        return songs;
    }

    public boolean contains(String song) {
        return songs.contains(song);
    }

    public int getNumberOfSongs() {
        return songs.size();
    }
}