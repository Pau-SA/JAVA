import java.util.Scanner;

import javax.xml.validation.Validator;
    
public class Condicions {
    public static void main(String[] args) throws Exception {
      
        String nom;
        int nombrellegit;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el teu nom: ");
        nom = teclat.next();
        System.out.print("Hola et dius " + nom + " ,entra un nombre ");
        nombrellegit = teclat.nextInt();


        if (nombrellegit < 0){
            System.out.print("El numero que has entrat es negatiu");
        } else if (nombrellegit > 5 && nombrellegit < 10) {
           System.out.println("El teu numero esta entre 5 i 10");
        } else{
            System.out.println("El numero que has entrat es positiu");
        }
        teclat.close();





    }






}




