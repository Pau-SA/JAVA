import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class MenjarNado {

    // static Scanner teclat = null;

    // private static int potitos(String missatge) {
    // int numeroPotitos = 0;
    // boolean llegitNombre = false;

    // teclat = new Scanner(System.in);
    // do {
    // try {
    // numeroPotitos = teclat.nextInt();
    // llegitNombre = false;
    // System.out.print(missatge);
    // } catch (Exception errorAGestionar) {
    // System.out.println("ERROR! només pots entrar nombres!" + errorAGestionar);
    // llegitNombre = true;
    // } finally {
    // if (numeroPotitos > 25){
    // System.out.println("ERROR! El niño no puede comer mas mierda");
    // }
    // }
    // } while (llegitNombre = true);

    // return numeroPotitos;
    // }

    // private static int demanoIngredients(String missatge) {
    // int nombreLlegit = 0;
    // boolean llegitNombre = false;
    // teclat = new Scanner(System.in);
    // do {
    // try {
    // llegitNombre = false;
    // System.out.print(missatge);
    // } catch (Exception errorAGestionar) {
    // System.out.println("ERROR! només pots entrar nombres!" + errorAGestionar);
    // llegitNombre = true;
    // } finally {
    // nombreLlegit = teclat.nextInt();
    // }
    // } while (llegitNombre = true);

    // return nombreLlegit;
    // }

    public static void main(String[] args) throws Exception {
        int numeroMenu;
        int comptador;

        try {
            File fitxer = new File("filein.txt");
            java.util.Scanner fileScanner = new Scanner(fitxer);
            String linia;

            // GUAREM EN UNA VARIABLE "NUMEROMENU" EL NÚMERO DE LA POSICIO 0
            linia = fileScanner.nextLine();
            numeroMenu = Character.getNumericValue(linia.charAt(0));
            System.out.println(numeroMenu);

            int posiDeArraySI = 0;
            int posiDeArrayNO = 0;

            while (fileScanner.hasNextLine()) {

                // LLEGIM LES LINES DEL FITXER
                linia = fileScanner.nextLine();

            
                // GUARDEM A LA VARIABLE RESPOSTA, EL SI I EL NO
                String[] resposta = linia.split(" ");

              
                String[][] menunenSI = new String[numeroMenu][12];
                String[][] menunenNO = new String[numeroMenu][12];

                
                if (resposta[0] == "SI:") {
                    for (int j = 1; j < resposta.length - 2; j++) {
                        menunenSI[posiDeArraySI][j] = resposta[j];
                    }
                } else {
                    for (int j = 1; j < resposta.length - 2; j++) {
                        menunenNO[posiDeArrayNO][j] = resposta[j];
                    }
                }



                for (int i = 0; i < menunenNO.length; i++) {
                    for (int j = 0; j < menunenNO[i].length; j++) {
                        if (menunenSI[i][j] == menunenNO[i][j]) {

                            System.out.print(resposta[j]);

                        }
                    }
                }

             

                for (int i = 0; i < resposta.length; i++) {
                    System.out.print(resposta[i] + " ");
                }
                System.out.println();
                // System.out.println(numeroMenu);

                // comptador++;
                // }

            }

            fileScanner.close();
        } catch (Exception MissatgeError) {
            System.out.println("Error lectura fitxer" + MissatgeError.getMessage());
        }
    }

}
