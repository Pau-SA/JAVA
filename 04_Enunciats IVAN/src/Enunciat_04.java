import java.util.Scanner;

public class Enunciat_04 {
    
    public static void main(String[] args) throws Exception {
        Scanner teclat = new Scanner(System.in);
        int valorEntrat;
        System.out.println("Entra un número: ");
        valorEntrat = teclat.nextInt();
        
            for (int i=1; i <= valorEntrat; i += 1) { // i-- -> i + 1
            System.out.println(i);


            }
    }      
}






