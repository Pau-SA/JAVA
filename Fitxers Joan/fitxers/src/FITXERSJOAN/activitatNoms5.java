package FITXERSJOAN;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class activitatNoms5 {
    public static void main(String[] args) {

        Scanner punter = null;
        String linia = "";
        File fitxer = new File("fileout.txt");
        try {
            System.out.println("... Llegim el contingut del fitxer ...");
            punter = new Scanner(fitxer);

            linia = punter.nextLine(); // Salvem la linia dins d'un String
            System.out.println(linia); // Mostrem la linia

            String array[];
            array = linia.split("&");

            String[] resultat = new String[array.length];

            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                resultat[j] = array[i];
            }

            for (int i = 0; i < resultat.length; i++) {
   
                System.out.println(resultat[i]);
            }

        } catch (Exception exepcio1) {
            System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
    }
}