package FITXERSJOAN;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class actiivitat4 {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        //#region primos;
        /*
        int nombreEntrat;
        boolean esPrimer;

        System.out.print("Entra un número: ");
        nombreEntrat = teclat.nextInt();
        System.out.println(nombreEntrat);
        esPrimer = Funcions.esPrimo(nombreEntrat);

        if (esPrimer == true) {
            System.out.println("El nombre entrat " + nombreEntrat + " es primer");
        } else {
            System.out.println("El nombre entrat " + nombreEntrat + " no es primer");
        }

        // PER ESCRIURE AL FITXER nombres del 2 al 100, pero només els primers
        FileWriter fitxer = null;
        try {
            fitxer = new FileWriter("fileout.txt", false);

            for (int i = 2; i < 100; i++) {
                if (Funcions.esPrimo(i)) {
                    fitxer.write(i);
                }
            }

            fitxer.close();
            teclat.close();
        } catch (Exception MissatgeError) {
            System.out.println("Error inesperat. " + MissatgeError.getMessage());
        }
        */
        //#endregion



        // OMPLIR UNA MATRIU (files) I (columnes)
        int files, columnes;
        do {
            System.out.print("Entra la quantitat de files: ");
            files = teclat.nextInt();

            System.out.print("Entra la quantitat de columnes: ");
            columnes = teclat.nextInt();

            if (((files < 0) || (columnes < 0))) {
                System.out.println("ERROR, TONRA-HI");
            }
        } while (((files < 0) || (columnes < 0)));



        int[][] matriu = Funcions.matriu(files,columnes);

        for (int i = 0; i < matriu.length; i++) {
            String text = "";
            for (int j = 0; j < matriu[i].length; j++) {
                text+=matriu[i][j];
            }
            Funcions.writeLineOnFile(text, true, (i==0)?false:true);
        }
        teclat.close();
    }
}