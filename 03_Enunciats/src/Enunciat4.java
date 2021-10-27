import java.util.Scanner;

public class Enunciat4 {
    public static void main(String[] args){

   Scanner teclat = new Scanner(System.in);

    float quantitat ;
    final float interesdiners = 2 ;
    int mesos ;
    float interesgenerat ;

   
        
    System.out.print("Entra la quantitat ");
    quantitat = teclat.nextInt();



    System.out.print("Entra els mesos: ");
    mesos = teclat.nextInt();



    interesgenerat = quantitat * (interesdiners/100/12) * mesos;
    System.out.print("El interes generat es de: " + interesgenerat + " Euros");

    }
    
}
