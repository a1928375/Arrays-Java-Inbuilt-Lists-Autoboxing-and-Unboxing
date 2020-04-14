package com.company;

import java.util.ArrayList;

public class Album {

    private Song song;
    private ArrayList<Song> myAlbum = new ArrayList<Song>();

    public ArrayList<Song> getMyAlbum() {
        return myAlbum;
    }

    public boolean addSong (String title, double duration) {

        for (int i =0; i < myAlbum.size(); i++) {

            if (myAlbum.get(i).getTitle().equals(title)) {

                System.out.println("The song exists in this album. Try different songs.");
                return false;
            }
        }
        Song newSong = new Song(title, duration);
        myAlbum.add(newSong);
        return true;
    }

}
