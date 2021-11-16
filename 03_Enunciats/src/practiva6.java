import java.util.Scanner;

public class practiva6 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int numero;

        System.out.println("1 --> Dilluns");
        System.out.println("2 --> Dimarts");
        System.out.println("3 --> Dimecres");
        System.out.println("4 --> Dijous");
        System.out.print("Ara, entra un dia de la setmana en numero: ");

        numero = teclat.nextInt();



        if (numero == 1){
            System.out.println("Es Dilluns!!");
        }else{
            if (numero == 2){
                System.out.println("Es Dimarts!!");
            }
        }




    }
}
