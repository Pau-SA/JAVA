import java.util.Scanner;

public class Enunciat25 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        final int MIDA = 5;
        String[] cadenesGuardades = new String[MIDA];
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;



        for (int i = 0; i < cadenesGuardades.length; i++) {
            System.out.println("Entra 5 Paraules");
            cadenesGuardades[i] = teclat.nextLine().toLowerCase(); //toUpperCase --> A // toLowerCase --> a


            for (int j = 0; j < cadenesGuardades[i].length(); j++) {
                if (cadenesGuardades[i].charAt(j) == 'a') {
                    contadorA++;

                } else if (cadenesGuardades[i].charAt(j) == 'e') {
                    contadorE++;

                } else if (cadenesGuardades[i].charAt(j) == 'i') {
                    contadorI++;

                } else if (cadenesGuardades[i].charAt(j) == 'o') {
                    contadorO++;

                } else if (cadenesGuardades[i].charAt(j) == 'u') {
                    contadorU++;

                }
            }
        }

        System.out.println("Tindràs " + contadorA + " A" + " a totes les paraules");
        System.out.println("Tindràs " + contadorE + " E" + " a totes les paraules");
        System.out.println("Tindràs " + contadorI + " I" + " a totes les paraules");
        System.out.println("Tindràs " + contadorO + " O" + " a totes les paraules");
        System.out.println("Tindràs " + contadorU + " U" + " a totes les paraules");

        teclat.close();

    }
}