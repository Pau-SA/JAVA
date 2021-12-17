import java.util.Scanner;

public class Enunciat37 {
    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);
        int files, columnes;

        System.out.print("Entra la quantitat de files: ");
        files = teclat.nextInt();

        System.out.print("Entra la quantitat de columnes: ");
        columnes = teclat.nextInt();

        int[][] Enters = new int [files][columnes];
        
        //PER OMPLIR LA MATRIU DE RANDOMS
        for (int i=0; i < Enters.length; i++){
            for (int j=0; j < Enters[i].length; j++){
                Enters[i][j] = (int) (Math.random() * 10);
            }
        }


        //PER MOSTRAR L'ARRAY
        for (int i=0; i < Enters.length; i++){
            for (int j=0; j < Enters[i].length; j++){
                System.out.print(Enters[i][j] + " ");
            }
            System.out.println();//ES ESSENCIAL, PERQUE CADA X CARACTERS PER FILA, FA UN ESPAI
        }
        teclat.close();
    }

}
