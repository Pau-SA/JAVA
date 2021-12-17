import java.util.Scanner;

public class matrius {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int[][] numero = new int[10][10];  //aqui podem posar 11 i aixi no hem de sumar +1 a la i (i) a la (j)


        //PER FER LES OPERACIONS
        for (int i = 0; i < numero.length; i++) {

            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = (i+1)*(1+j);
                
            }
        }




        //PER ENSENYAR EL RESULTAT
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                System.out.print(  (i+1) + " x " + (j+1) + " = " + " " +numero[i][j]+ "  " );
            }
            System.out.println(" ");
        }

        teclat.close();
    }

}
