package FITXERSJOAN;

import java.sql.Struct;
import java.util.Scanner;

public class activitat8 {
    public class FitEnu06_DosFitxersTresMatrius {

        static final int MIDA = 8;
        static final char AIGUA = 'A';
        static final char VAIXELL = 'V';
        static Scanner teclat;
        static char[][] tauler;
        static int numeroVaixells;

        public static void mostraTauler(){
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    System.out.print(tauler[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

        public static void ompleTauler()
        {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler.length; j++) {
                    tauler[i][j] = AIGUA;
                }
            }
        }

        public static void mostrarMissatge(String cadena) {
            System.out.print(cadena);
        }

        public static void afegirVaixell (int contador) {
            int x, y;
            boolean esCorrecte = false;
            mostrarMissatge("Vaixell "+(contador + 1) +"\n");
            while(esCorrecte == false)
            {
                esCorrecte = false;
                mostrarMissatge("---Introdueix la posicio x: ");
                x = teclat.nextInt();
                mostrarMissatge("---Introdueix la posicio y: ");
                y = teclat.nextInt();
                if (tauler[x-1][y-1]==AIGUA)
                {
                    esCorrecte = true;
                    tauler[x-1][y-1] = VAIXELL;
                }
                else
                {
                    mostrarMissatge("La posició està ocupada\n");
                }
            }
        }



        public static void main(String[] args) {
            teclat = new Scanner(System.in);
            tauler = new char[MIDA][MIDA];

            ompleTauler();

            mostrarMissatge("Quants vaixells vols en el teu taulell? ");
            numeroVaixells = teclat.nextInt();
            mostrarMissatge("\n");
            for (int i = 0; i < numeroVaixells; i++) {
                afegirVaixell(i);
                mostraTauler();
            }





        }


    }




}
