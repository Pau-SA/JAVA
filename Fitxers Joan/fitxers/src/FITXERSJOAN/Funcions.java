package FITXERSJOAN;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Funcions {

    final static String FILENAME = "./fileout.txt";
    static FileWriter fileWriter = null;

    // public static boolean esPrimo(int numero) {
    // for (int i = 2; i < numero / 2; i++) {
    // // Si es divisible por cualquiera de estos números, no
    // // es primo
    // if (numero % i == 0)
    // return false;
    // }
    // // Si no se pudo dividir por ninguno de los de arriba, sí es primo
    // return true;
    // }








    //PER MOSTRAR DEL 1 AL N, FENT 1,2,3
    //                             4,5,6
    public static void writeLineOnFile(String text, boolean linebreak, boolean erase) {
        try {
            fileWriter = new FileWriter(FILENAME, erase);
            fileWriter.write(text + (linebreak ? "\n" : ""));
            fileWriter.close();
            System.out.print(text);
        } catch (Exception e) {
            System.out.print("Error! " + e + "\n");
        }
    }

    public static int[][] matriu(int files, int columnes) {

        int[][] matriu = new int[files][columnes];
        int contador = 0;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                contador++;
                matriu[i][j] = contador;

            }
        }
        return matriu;
    }



    //PER A FER LLEGIR ELS NOMS I ESCRIUREL'S EN SENTIT CONTRARI
    public static String llegirLiniaFitxer(String nomCompletFitxer, int liniaALlegir) {

        File fitxer = new File(FILENAME);

        Scanner punter = null;
        String resultat = "";

        try {
            // Llegim el contingut del fitxer
            // System.out.println("... Llegim el contingut del fitxer ...");
            punter = new Scanner(fitxer);

            // Llegim una línia del contingut del fitxer
            while (punter.hasNextLine() || liniaALlegir == 0) {
                resultat = punter.nextLine(); // Salvem la linia dins d'un String
                 System.out.println(resultat); // Mostrem la linia
                liniaALlegir--;
            }

        } catch (Exception exepcio1) {
            resultat = exepcio1.getMessage();
            // System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                resultat = exepcio2.getMessage();
                // System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
        return resultat;
    }
}
