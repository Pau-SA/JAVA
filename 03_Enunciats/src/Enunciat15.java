import java.util.Scanner;

public class Enunciat15 {
    public static void main(String[] args) throws Exception {
        double ah, be, resultat;

        Scanner teclat = new Scanner(System.in);

        do{

            System.out.print("Entra el PRIMER nombre ");
            ah = teclat.nextDouble();

            System.out.print("Entra el SEGON nombre ");
            be = teclat.nextDouble();

            if ((ah <= 0 ) || (be <= 0));{
                System.out.println("ERROR!!!");
            }
            
        } while ((ah <= 0 ) || (be <= 0));



        resultat = (float) Math.pow(ah,be);

        System.out.println("El resultat de la operació es " + resultat);
    }
}




