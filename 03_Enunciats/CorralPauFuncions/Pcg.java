package CorralPauFuncions;

import java.util.Scanner;

public class Pcg {
    static Scanner teclat = new Scanner(System.in);

    public static boolean esNegatiu(int nombreEntrat) {

        boolean esNegatiu = false;

        if (nombreEntrat < 0) {
            esNegatiu = true;
        }
        return esNegatiu;
    }

    // PER DEMANAR UN NOMBRE
    public static int llegirEnterAmbMissatge(String Missatge) {

        int numeroLlegit = 0;
        boolean nombreIncorrecte = false;

        do {
            try {
                nombreIncorrecte = false;
                System.out.print(Missatge);
                numeroLlegit = teclat.nextInt();
            } catch (Exception e) {
                System.out.println("Només pots entrar nombres," + " torna a intentar-ho!");
                nombreIncorrecte = true;
                teclat.nextLine(); // Netejem el buffer d'entrada
            }
        } while (nombreIncorrecte == true);
        return numeroLlegit;
    }



    //PER MOSTRAR DEL NUMERO1 AL NUMERO2
    public static void mostraCompresos(int numero1, int numero2) {

        for (int i = numero1; i <= numero2 ; i++) {
            System.out.println(i);
        }

    }




    public static int tornaMaxim(int numero1, int numero2) {
        int maxim = 0;

        if (numero1 > numero2) {
            maxim = numero1;
        } else {
            maxim = numero2;
        }
        return maxim;
    }


    

}
