/*
 *Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() { return name; }
    public String getArtist() { return artist; }

    @Override
    public String toString() {
        return name + " by " + artist;
    }
}

class MusicLibrary {
    private List<Song> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " + song);
    }

    public void removeSong(Song song) {
        if (songs.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found.");
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        System.out.println("Playing: " + songs.get(index));
    }

    public void showSongs() {
        System.out.println("\n Music Library ");
        for (Song s : songs) {
            System.out.println("- " + s);
        }
    }
}

public class MusicLib {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        Song song1 = new Song("Bismil", "Sukhwinder Singh");
        Song song2 = new Song("Faded", "Alan Walker");
        Song song3 = new Song("Perfect", "Ed Sheeran");
        Song song4 = new Song("Lose Yourself", "Eminem");
        Song song5 = new Song("Galliyan", "Arijit Singh");

        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addSong(song5);

        library.showSongs();

        library.playRandomSong();

        library.removeSong(song2);
        library.showSongs();
    }
}
