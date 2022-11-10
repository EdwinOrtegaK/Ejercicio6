package Controler;
import Model.ICancion;
import Model.IIpod_simulator;
import DriverProgram.Main;
import Model.Cancion;

import java.util.ArrayList;
import java.util.Scanner;

public class Usages {
    public static void agregarC(Scanner marrep, ArrayList<Cancion> canciones){
        System.out.println("Nombre de la canción: ");
        String title = marrep.nextLine();
        System.out.println("Artista de la canción: ");
        String artista = marrep.nextLine();
        System.out.println("Album de la canción: ");
        String album = marrep.nextLine();
        System.out.println("Duración de la canción: ");
        String duracion = marrep.nextLine();
        System.out.println("ID de la canción: ");
        int id = marrep.nextInt();
        Cancion cancion = new Cancion(title, artista, album, duracion, id);
        canciones.add(cancion);
    }
    public static void eliminarC(Scanner marrep, ArrayList<Cancion> canciones){
        System.out.println("Nombre de la canción: ");
        String title = marrep.nextLine();
        canciones.remove(title);
    }
    public static void reproC(){

    }
    public static void agregarFav(Scanner marrep, ArrayList<Cancion> canciones){
        System.out.println("Nombre de la canción: ");
        String title = marrep.nextLine();
        System.out.println("Artista de la canción: ");
        String artista = marrep.nextLine();
        System.out.println("Album de la canción: ");
        String album = marrep.nextLine();
        System.out.println("Duración de la canción: ");
        String duracion = marrep.nextLine();
        System.out.println("ID de la canción: ");
        int id = marrep.nextInt();
        Cancion cancion = new Cancion(title, artista, album, duracion, id);
        canciones.add(cancion);
    }
    public static void eliminarFav(Scanner marrep, ArrayList<Cancion> canciones){
        System.out.println("Nombre de la canción: ");
        String title = marrep.nextLine();
        canciones.remove(title);
    }
}
