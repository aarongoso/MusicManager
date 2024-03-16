/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managemusic;



/**
 *
 * @author aaron
 */
public class PlaylistManager implements Repeatable {
    private boolean repeat;
    private Playlist repeatPlaylist;

    public PlaylistManager() {
        repeatPlaylist = new Playlist() {};
    }

    public void repeat() {
        repeat = !repeat; // Toggle repeat state
        System.out.println("Playlist repeat is " + (repeat ? "enabled" : "disabled"));
    }
    
    // Check if repeat mode is enabled.
    // True if repeat mode is enabled, false otherwise.
    public boolean isRepeatEnabled() {
        return repeat;
    }
    
    // Adds songs to the repeat playlsit
    public void addSongToRepeatPlaylist(String song) {
        repeatPlaylist.addSong(song);
    }
    
    // Gets the repeat playlist
    public Playlist getRepeatPlaylist() {
        return repeatPlaylist;
    }
}
