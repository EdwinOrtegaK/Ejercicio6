package DriverProgram;
import Controler.Usages;
import Model.Cancion;
import Model.IPod;
import com.sun.source.tree.NewArrayTree;
import java.util.ArrayList;
import java.util.Scanner;
import static Controler.Usages.*;


public class Main {
    static Scanner mareep = new Scanner(System.in);

    public static void main(String[] args){
        int ver = 20;
        IPod Loudred = new IPod();
        System.out.println("===Mi IPod===");
        while (!(ver == 0)){
            System.out.println("===Men�===");
            System.out.println("�Qu� desea ahcer?" +
                    "\n1. Agregar canci�n" +
                    "\n2. Eliminar canci�n" +
                    "\n3. Reproducir canci�n" +
                    "\n4. Ver control de volumen" +
                    "\n5. Pasar canci�n" +
                    "\n6. Regresar canci�n" +
                    "\n7. Agregar a favoritos" +
                    "\n8. Eliminar de favoritos" +
                    "\n9. Ver canciones favoritas" +
                    "\n10. Ver canciones" +
                    "\n11. Bloquear los controles" +
                    "\n12. Apagar IPod");
            ver = mareep.nextInt();
            mareep.nextLine();
            switch (ver){
                case 1:
                    agregarC(mareep, Loudred.getCanciones());
                    System.out.println("Se ha agregado la canci�n");
                    break;
                case 2:
                    eliminarC(mareep, Loudred.getCanciones());
                    System.out.println("Se ha eliminado la canci�n");
                    break;
                case 3:
                    reproC();
                    System.out.println("Se esta reproduciendo la canci�n");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    agregarFav(mareep, Loudred.getCanciones());
                    System.out.println("Se ha agregado la canci�n a favoritos");
                    break;
                case 8:
                    eliminarFav(mareep, Loudred.getCanciones());
                    System.out.println("Se ha eliminado la canci�n de favoritos");
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println();
                    break;
                case 11:
                    System.out.println("El IPod se bloqueo");
                    break;
                case 12:
                    System.out.println("El IPod se ha apagado");
                    ver = 0;
                    break;
            }
        }
    }
}
