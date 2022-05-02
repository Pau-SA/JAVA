package Activitat_7;

import java.util.Scanner;

public class App {
    private static Scanner teclat = new Scanner(System.in);

    static int tornaAleatori(int minim, int maxim) {
        return (int) (Math.random() * (maxim - minim) + minim);
    }

    public static void main(String[] args) {

        // System.out.print("Introdueix les posicions de la cursa: ");
        // int quantitatCursa = teclat.nextInt();
        Cursa[] arrayCursa = new Cursa[3];

        arrayCursa[0] = new Cursa(200);
        arrayCursa[1] = new Cursa(400);
        arrayCursa[2] = new Cursa();

        arrayCursa[2].setMetres(800);



        for (int i = 0; i < arrayCursa.length; i++) {
            arrayCursa[i].setVoltes(tornaAleatori(1, 50));
        }
        
        System.out.println("\nInformació de les arrayCursa");
        System.out.println("========================");
        for (int i = 0; i < arrayCursa.length; i++) {
            System.out.println("Cursa " + (i + 1) + arrayCursa[i].toString());
            System.out.println("  Distancia recorreguda " + arrayCursa[i].distanciaRecorreguda());
            System.out.println();
        }
   
    }
   
}
