import java.util.Scanner;

public class Enunciat10 {
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);


        int valorEntrat;
        int resultat = 0;


        System.out.print("Entra un número: ");
        valorEntrat = teclat.nextInt();
        
        
        System.out.print("!" + valorEntrat + " = ");
        
        for (int i=valorEntrat; i > 0; i--){
            
            resultat = resultat + valorEntrat;
            valorEntrat --;
            System.out.print(" + " + i);
            teclat.close();
        }
        
        System.out.println(" El sumatori de " + resultat);

    }
}