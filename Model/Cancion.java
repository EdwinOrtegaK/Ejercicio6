package Model;

import java.util.ArrayList;

public class Cancion implements ICancion {
    private String Title;
    private String Artista;
    private String Album;
    private String Duracion;
    private int ID;

    public Cancion(String title, String artista, String album, String duracion, int id) {
        this.Title = title;
        this.Artista = artista;
        this.Album = album;
        this.Duracion = duracion;
        this.ID = id;
    }
    @Override
    public void setTitle(String _title) {
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setArtist(String _artist) {
    }

    @Override
    public String getArtist() {
        return null;
    }

    @Override
    public void setAlbum(String _album) {
    }

    @Override
    public String getAlbum() {
        return null;
    }

    @Override
    public void setDuration(String _duration) {
    }

    @Override
    public String getDuration() {
        return null;
    }

    @Override
    public void setID(int _id) {
    }

    @Override
    public int getID() {
        return 0;
    }
}
