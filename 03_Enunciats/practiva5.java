import java.util.Scanner;

public class practiva5 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1;
        int num2;
        int suma, resta, multi, divi;

        System.out.print("Entra el primer numero: ");
        num1 = teclat.nextInt();

        System.out.print("Entra el segon numero: ");
        num2 = teclat.nextInt();


        if(num1 > 0 || num2 > 0){
            suma = num1 + num2;
            System.out.println("La suma dels dos números es " + suma);
            resta = num1 - num2;
            System.out.println("La resta dels dos números es " + resta);
            multi= num1 * num2;
            System.out.println("La multiplicació dels dos números es " + multi);
            divi = num1 / num2;
            System.out.println("La divisió de els dos números es " + divi);

        }


        teclat.close();

    }

}
