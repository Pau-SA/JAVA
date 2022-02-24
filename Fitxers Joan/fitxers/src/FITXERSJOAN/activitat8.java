package FITXERSJOAN;

import java.io.FileWriter;
import java.lang.Thread.State;
// import java.sql.Struct;
import java.util.Scanner;

// import javax.swing.plaf.TableUI;
// import javax.swing.text.StyledEditorKit.BoldAction;

public class activitat8 {
    public class FitEnu06_DosFitxersTresMatrius {

        private static final String FRASE1 = "Quants vaixells vols en el teu taulell? ";
        static final int MIDA = 8;
        static final char AIGUA = 'A';
        static final char VAIXELL = 'V';
        static final char TOCAT = 'T';
        static Scanner teclat;
        static String torn = "jug1";
        // static char[][] tauler1 = new char[MIDA][MIDA];
        // static char[][] tauler2 = new char[MIDA][MIDA];
        static int numeroVaixells;

        public static void mostraTauler(char tauler[][]) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    System.out.print(tauler[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

        public static void ompleDAiguaTauler(char[][] tauler) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler.length; j++) {
                    tauler[i][j] = AIGUA;
                }
            }
        }

        public static void mostrarMissatge(String cadena) {
            System.out.print(cadena);
        }

        public static void afegirVaixell(int contador, char tauler[][]) {
            int x, y;
            boolean esCorrecte = false;
            mostrarMissatge("Vaixell " + (contador + 1) + "\n");

            while (esCorrecte == false) {
                esCorrecte = false;
                mostrarMissatge("---Introdueix la posicio x: ");
                x = teclat.nextInt();

                mostrarMissatge("---Introdueix la posicio y: ");
                y = teclat.nextInt();

                if (tauler[x - 1][y - 1] == AIGUA) {
                    esCorrecte = true;
                    tauler[x - 1][y - 1] = VAIXELL;

                } else {
                    mostrarMissatge("La posició està ocupada\n");
                }
            }
        }

        private static void omplirJugador(char[][] jugador) {
            // for (int player = 0; player < 2; player++) {
            if (torn == "jug1") {
                mostrarMissatge("Jugador 1\n");
            } else {
                mostrarMissatge("Jugador 2\n");
            }
            ompleDAiguaTauler(jugador);
            // mostrarMissatge("Jugador " + (player + 1) + "\n");

            mostrarMissatge(FRASE1);
            numeroVaixells = teclat.nextInt();

            mostrarMissatge("\n");
            for (int i = 0; i < numeroVaixells; i++) {
                afegirVaixell(i, jugador);
            }
            // mostraTauler(jugador);
            // }
        }

        private static void atacar(char[][] jugador) {
            int x;
            int y;
            mostrarMissatge("\nQuina es la posició que vols atacar? " + "\n");
            mostrarMissatge("---Introdueix la posicio x: ");
            x = teclat.nextInt();

            mostrarMissatge("---Introdueix la posicio y: ");
            y = teclat.nextInt();

            // for (int i = 0; i < numeroVaixells; i++) {
            // mostrarMissatge("Vaixell " + (numeroVaixells + 1) + "\n");

            vaixellTocat(x, y, jugador);
            // mostraTauler(player);
            // }
        }

        public static void vaixellTocat(int x, int y, char tauler[][]) {

            // mostrarMissatge("Vaixell " + (contador + 1) + "\n");
            if (tauler[x - 1][y - 1] == VAIXELL) {
                mostrarMissatge("L'has tocat!!\n");
                tauler[x - 1][y - 1] = TOCAT;
            } else
                mostrarMissatge("Has fallat! Torna-ho a intentar\n");
        }

        static boolean acabat(char[][] jugador) {

            for (int i = 0; i < jugador.length; i++) {
                for (int j = 0; j < jugador.length; j++) {
                    if (jugador[i][j] == VAIXELL) {
                        return false;
                    }
                }
            }
            return true;
        }

        static void escriureFitxer(char tauler[][]) {
            try {

                FileWriter fitxer = null;
                fitxer = new FileWriter("guardarTaulell.txt", false);

                for (int i = 0; i < tauler.length; i++) {
                    for (int j = 0; j < tauler.length; j++) {
                        fitxer.write(tauler[i][j]);

                    }
                }

                fitxer.close();

            } catch (Exception e) {
                // TODO: handle exception
            }
        }






        // FUNCIÓ MAIN
        public static void main(String[] args) {
            teclat = new Scanner(System.in);
            boolean gameOver = false;
            String guardar;

            char[][] jugador1 = new char[MIDA][MIDA];
            char[][] jugador2 = new char[MIDA][MIDA];

            omplirJugador(jugador1);

            // for (int player = 0; player < 2; player++) {
            // int x, y;

            // mostrarMissatge("\nTorn del Jugador " + (player + 1) + " tauler" + "\n");
            do {

                mostrarMissatge("\nTorn del Jugador 1 tauler" + "\n");
                mostraTauler(jugador1);

                atacar(jugador1);
                if (acabat(jugador1) == true) {
                    gameOver = true;
                }
            } while (gameOver == false);



            mostrarMissatge("Vols guardar la partida? *SI* o *NO*");
            guardar = teclat.next();

            try {
                if (guardar == "SI") {
                    escriureFitxer(jugador1);
                }else{
                    mostrarMissatge("Has acabat la partida sense guardar");
                    
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

           

            

        }

    }
}
