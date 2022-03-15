package CorralPauExamen20220121;

import java.util.Scanner;

public class Examen20220121 {

    public static void main(String[] args) {


        String cadena = Pcg20220121.teclat.nextLine(); 

        Pcg20220121.mostrarMissatge(cadena); 


        //ENTER
        int num = Pcg20220121.llegirEnterTeclat("Entra algun número enter: ");


        //CARACTER 
        char pau;
        pau = Pcg20220121.llegirCaracterTeclat("hola");
        


        //CADENA
        String text = Pcg20220121.teclat.nextLine();
        System.out.println("Has entrat "+ Pcg20220121.teclat.nextLine());


        //ES ENTER
        int pau;
        pau = System.out.println(Pcg20220121.esEnter(Pcg20220121.llegirEnterTeclat()));

        //ES LLETRA
        System.out.println(Pcg20220121.esLletra(Pcg20220121.llegirCaracterTeclat()));
    }
}
