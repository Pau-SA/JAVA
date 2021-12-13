import java.util.Scanner;

public class Enunciat30 {
    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);

        int[] arrPosicions = new int[5];
        int[] arrPosicionsFinal = new int[5];
        int valorEntrat;


        System.out.print("Entra el valor que vols que es deplaci l'array: ");
        valorEntrat = teclat.nextInt();



        for (int i = 0; i < arrPosicions.length; i++) {
            arrPosicions[i] = (int) (Math.random() * 100);
        }


            
        for (int i = 0; i < arrPosicions.length; i++) {
            System.out.println("Número: " + arrPosicions[i]);
        }



        for (int i = 0; i < arrPosicions.length; i++) {
            
            if (i == arrPosicions.length-1){
                arrPosicionsFinal[0] = arrPosicions[arrPosicions.length - 1];
            } else {
                arrPosicionsFinal[i + valorEntrat] = arrPosicions[i];
            }

        }



        System.out.println(" ");



        for (int i = 0; i < arrPosicionsFinal.length; i++) {
            System.out.println(arrPosicionsFinal[i]);
        }
        

        teclat.close();

    }
}
