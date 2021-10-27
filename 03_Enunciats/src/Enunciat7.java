import java.util.Scanner;

public class Enunciat7 {
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);
        int temperatura;


         {
            System.out.print("Entra la temperatura actual: ");
            temperatura = teclat.nextByte();
            if ((temperatura >= -30) || (temperatura >= -15)) {
                System.out.println("Massa fred");

            }   else if ((temperatura >= -14) || (temperatura <= -10)) {
                System.out.println("Molt fred");

            }   else if ((temperatura >= -9) || (temperatura <= 5)) {
                System.out.println("Fred");

                
            }//continuar
        } 


        
    }
}

