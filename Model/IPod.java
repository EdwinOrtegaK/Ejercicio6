package Model;

import java.util.ArrayList;

public class IPod implements IIpod_simulator{

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> favoritas) {
        this.favoritas = favoritas;
    }

    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList<Cancion> favoritas = new ArrayList();

    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        return false;
    }

    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        return false;
    }

    @Override
    public float getVolume() {
        return 0;
    }

    @Override
    public float setVolume(float volume) {
        return 0;
    }

    @Override
    public int Prev(int actual_index) {
        return 0;
    }

    @Override
    public int Next(int actual_index) {
        return 0;
    }

    @Override
    public int getActualIndex() {
        return 0;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {

    }

    @Override
    public void addToFavorite(ICancion _song) throws Exception {

    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        return null;
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        return null;
    }

    @Override
    public ICancion[] getAllSongs() {
        return new ICancion[0];
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        return null;
    }

    @Override
    public boolean isValidIndex(int index) {
        return false;
    }

    @Override
    public void addSongToList(String titulo, String artista, String album, String duracion, int id) throws Exception {
        if (canciones.size() < 50){
            Cancion song = new Cancion(titulo, artista, album, duracion, id);
            canciones.add(song);
        }
    }

    @Override
    public void deleteSongFromList(int index) throws Exception {

    }

    @Override
    public void deleteSongFromTop10(int index) throws Exception {

    }
}
