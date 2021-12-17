import java.util.Scanner;

public class Enunciat40 {
    public static void main(String args[]) throws Exception {


        Scanner teclat = new Scanner(System.in);
        int files, columnes;

        do{
            System.out.print("Entra la quantitat de files: ");
            files = teclat.nextInt();
    
            System.out.print("Entra la quantitat de columnes: ");
            columnes = teclat.nextInt();
            
            if((files < 0)||(columnes < 0)){
                System.out.println("ERROR, TONRA-HI");
            }
        }while((files < 0)||(columnes < 0));
     



        int array[][] = new int[files][columnes];
        
        for(int i=0; i < array.length; i++){
            array[i][array.length-i-1] = 1;
        }

        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j]);

            }
            System.out.print("\n");
        }






        teclat.close();
    }
}

