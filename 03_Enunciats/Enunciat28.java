import java.util.Scanner;

public class Enunciat28 {
    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);
        int contador = 0;
        int n;
        int k;
        
        System.out.println("Entra el valor de N");
        n = teclat.nextInt();
        
        System.out.println("Entra el valor de K");
        k = teclat.nextInt();

        int[] arrNombre = new int[n];

        // PER INICIAR L'ARRAY I DONAR (N) NÚMEROS ALEATORIS
        for (int i = 0; i < arrNombre.length; i++) {
            arrNombre[i] = (int) (Math.random() * 100);
        }
        

        // PER FER ELS CALCULS DE L'ARRAY
        for (int i = 0; i < arrNombre.length; i++) {
            if (arrNombre[i] % k == 0) {
                contador++;
            }
        }


        //PER MOSTRAR PER PANTALLA L'ARRAY QUE HEM OMPLERT PRÈVIAMENT
        for (int i = 0; i < arrNombre.length; i++) {
            System.out.print(" " + arrNombre[i]);
        }
        
        System.out.println("\nDins de l'array de valor " + n + " hi ha " + contador + " divisors.");
        teclat.close();
    }

}
