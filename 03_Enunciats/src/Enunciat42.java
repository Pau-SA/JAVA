import java.util.Scanner;

public class Enunciat42 {
    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);

        int files, columnes, files2, columnes2, operacio;

        do {
            System.out.print("Entra la quantitat de files de la primera taula: ");
            files = teclat.nextInt();

            System.out.print("Entra la quantitat de columnes de la primera taula: ");
            columnes = teclat.nextInt();

            System.out.print("Entra la quantitat de files de la segona taula: ");
            files2 = teclat.nextInt();

            System.out.print("Entra la quantitat de columnes de laa segona taula: ");
            columnes2 = teclat.nextInt();

            System.out.print("Que vols fer Sumar (1) o Restar(2)");
            operacio = teclat.nextInt();



            if (((files < 0) || (columnes < 0)) || ((files2 < 0) || (columnes2 < 0))) {
                System.out.println("ERROR, TONRA-HI");
            }
        } while (((files < 0) || (columnes < 0)) || ((files2 < 0) || (columnes2 < 0)));

        int[][] arr1 = new int[files][columnes];
        int[][] arr2 = new int[files2][columnes2];
        int[][] matriuFinal = new int[files][columnes];

        // PER OMPLIR LA MATRIU 1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print("Entra un numero per la matriu 1: ");
                arr1[i][j] = teclat.nextInt();
            }
        }

        // PER MOSTRAR LA MATRIU 1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);

            }
            System.out.println();
        }

        // PER OMPLIR LA MATRIU 2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("Entra un numero per la matriu 2: ");
                arr2[i][j] = teclat.nextInt();
            }
        }

        // PER MOSTRAR LA MATRIU 2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }




        

        // FER ELS CALCULS DE MATRIU1 I MATRIU2
        for (int i = 0; i < matriuFinal.length; i++) {
            for (int j = 0; j < matriuFinal.length; j++) {

                if(operacio == 1){
                    matriuFinal[i][j] = arr1[i][j] + arr2[i][j];
                }else{
                    matriuFinal[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
        }

        // MOSTRAR LES OPERACIONS REALITZADES
        System.out.println();
        System.out.println("El resultat de les operacions es: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(matriuFinal[i][j]);
            }
            System.out.println();
        }

    }
}
