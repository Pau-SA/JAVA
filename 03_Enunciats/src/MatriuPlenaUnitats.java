import java.util.Scanner;

public class MatriuPlenaUnitats {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int[][] numero = new int[5][5];

        for (int i = 0; i < numero.length; i++) {

            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = i;

            }
        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                System.out.print(" " + numero[i][j] + " ");
            }
            System.out.println();
        }

        teclat.close();
    }

}
