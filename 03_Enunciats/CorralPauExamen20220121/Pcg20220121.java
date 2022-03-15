package CorralPauExamen20220121;

import java.util.Scanner;

public class Pcg20220121 {
    static Scanner teclat = new Scanner(System.in);

    // MOSTRAR MISSATGE
    public static String mostrarMissatge(missatge) {
        System.out.print(missatge);
    }

    // LLEGIR ENTER TECLAT
    public static int llegirEnterTeclat(int Missatge) {
        int numeroLlegit = 0;
        boolean nombreIncorrecte = false;

        do {
            try {
                nombreIncorrecte = false;
                System.out.print(Missatge);
                numeroLlegit = teclat.nextInt();
                System.out.println(numeroLlegit);
            } catch (Exception e) {
                System.out.println("Només pots entrar nombres," + " torna a intentar-ho!");
                nombreIncorrecte = true;
                teclat.nextLine();
            }
        } while (nombreIncorrecte == true);
        return numeroLlegit;
    }




    // LLEGIR CARACTER TECLAT
    public static char llegirCaracterTeclat(String Missatge) {
        char caracter = ' ';
        boolean caracterIncorrecte = false;
        do {
            try {
                caracterIncorrecte = false;
                System.out.print(Missatge);
                caracter = teclat.next().charAt(0);
                System.out.println(caracter);
            } catch (Exception e) {
                System.out.println("Només pots entrar caracters," + " torna a intentar-ho!");
                caracterIncorrecte = true;
                teclat.next();
            }
        } while (caracterIncorrecte == true);
        return caracter;
    }

    // LLEGIR CADENA DE LLETRES TECLAT
    public static String llegirCadenaDeLletresTeclat() {

        String cadenaDeLletres = teclat.nextLine();
        return cadenaDeLletres;
    }



    // ES ENTER
    public static boolean esLletra(char valor) {

        boolean esLletra = false;
        if (valor > 65 && valor < 90) {
            esLletra = true;
        }

        if (valor > 97 && valor < 122) {

            esLletra = false;

        }

        return esLletra;
    }



    //ES LLETRA
    public static boolean esEnter(char valor) {

        boolean esEnter = false;
        if (valor > 97 && valor < 122) {
            esEnter = false;
        }

        if (valor > 65 && valor < 90) {

            esEnter = true;

        }

        return esEnter;
    }


    //MOSTRAR MISSATGE SEGONS ELS SALT
}
