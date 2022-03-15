import java.util.Scanner;

public class Enunciat39 {
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
     


        //PER OMPLIR LA MATRIU
        int[][] MatriuQuadrada = new int [files][columnes];

        for (int i=0; i < MatriuQuadrada.length; i++){
            for (int j=0; j < MatriuQuadrada[i].length; j++){

                if(i == j){
                    MatriuQuadrada[i][j] = 1;

                }else{
                    MatriuQuadrada[i][j] = 0;

                }
            }
        }

        

        //PER MOSTRAR LA MATRIU
        for (int i=0; i < MatriuQuadrada.length; i++){
            for (int j=0; j < MatriuQuadrada[i].length; j++){

                System.out.print(MatriuQuadrada[i][j] + " ");

            }
            
            System.out.println();
        }
        
        teclat.close();
    }
}
