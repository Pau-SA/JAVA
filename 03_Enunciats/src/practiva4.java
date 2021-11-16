import java.util.Scanner;

import javax.xml.validation.Validator;

public class practiva4 {
    public static void main(String[] args) {
            
        Scanner teclat = new Scanner(System.in);

        int valorEntrat;
        int contador = 0;
        int negatiu = 0;
        int positiu = 0;


        do{

            System.out.print("Entra un valor: ");
            valorEntrat = teclat.nextByte();

            if (valorEntrat < 0){
                negatiu++;

            }else{
                positiu++;
            }
            

        }while (valorEntrat != 0);


        System.out.println("Hi ha " + negatiu + " numeros negatius");
        System.out.print("Hi ha " + positiu + " numeros positius");

    }

}
