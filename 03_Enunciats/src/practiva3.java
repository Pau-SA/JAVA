import java.util.Scanner;

public class practiva3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int valorEntrat;
        int contador = 0;


        System.out.println("Entra un número");
        valorEntrat = teclat.nextByte();
        System.out.println("El teu número entrat es: " + valorEntrat);


        for (int petit = 0; petit < valorEntrat; petit++){
            System.out.println(petit + 1);
            contador++;
        }
        
        System.out.println("Hi ha " + contador + " números");

    }
}