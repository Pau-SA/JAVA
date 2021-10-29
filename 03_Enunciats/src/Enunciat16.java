import java.util.Scanner;

public class Enunciat16 {
    public static void main(String[] args) throws Exception {
        double ah, be, resultat;

        Scanner teclat = new Scanner(System.in);

        do {

            System.out.print("Entra el PRIMER nombre ");
            ah = teclat.nextDouble();

            System.out.print("Entra el SEGON nombre ");
            be = teclat.nextDouble();

            if ((ah <= 0) || (be <= 0)) {
                System.out.println("ERROR!!!");
            }

        } while ((ah <= 0) || (be <= 0));

        if (ah % be == 0) {
            System.out.println("El resultat es divisor");
        } else {
            System.out.println("El resultat no es divisor");
        }

    }
}