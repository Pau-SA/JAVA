import java.util.Scanner;

public class Enunciat_05 {
    public static void main(String[] args){

        Scanner teclat = new Scanner(System.in);
        int valorEntrat;
        int resultat = 1;
        System.out.print("Entra un número: ");
        valorEntrat = teclat.nextInt();
        
        System.out.print("!");
        System.out.print(valorEntrat);
        System.out.print(" = ");
        for (int i=valorEntrat; i > 0; i--){
            
            resultat = resultat * valorEntrat;
            valorEntrat --;
            System.out.print(i);
            teclat.close();


        }

        
        System.out.println(" El teu resultat es " + resultat);

        
    }
}