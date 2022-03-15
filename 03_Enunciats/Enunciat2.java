import java.util.Scanner;

public class Enunciat2 {
    
    public static void main(String[] args) throws Exception {
        String nom;
        int edat;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el teu nom: ");
        nom = teclat.next();
        System.out.print("Entra la teva edat: ");
        edat = teclat.nextInt();

        System.out.print("El teu nom es " + nom + " i la teva edat es " + edat);

        teclat.close();


        
    }
}
