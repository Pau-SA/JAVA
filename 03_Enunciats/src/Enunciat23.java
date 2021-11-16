import java.util.Scanner;

public class Enunciat23 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        String[] array = new String[5];
        int[] longitud = new int[5];
        

        
        for (int i=0; i < array.length; i++ ){
            System.out.println("Entra 5 cadenes de text");  
            array[i]=teclat.nextLine();
            longitud[i] = array[i].lenght();

                
        }
    }
}
