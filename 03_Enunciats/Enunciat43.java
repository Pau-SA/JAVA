import java.util.Scanner;

public class Enunciat43 {


    
    static void linia(int columnes){
        int cont = 0;
        do{
           
            System.out.print("+---");
            cont++;
               
        } while(cont < columnes);
        System.out.println("+");        
    }



    static void mostrarMatriu(int[][] matriu){
        int columnes = matriu[0].length;
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                int cont = 0;
                if(matriu[i][j] < 0 && matriu[i][j] > -10){
                    System.out.print("| " + matriu[i][j] + "");   
                }
                if(matriu[i][j] <= -10){
                    System.out.print("|" + matriu[i][j] + "");
                }
                if(matriu[i][j] >= 0 && matriu[i][j] < 10){
                    System.out.print("|  " + matriu[i][j] + "");
                }
                if(matriu[i][j] >= 10){
                    System.out.print("| " + matriu[i][j] + "");
                }
                do{
                    cont++;
                }while(cont <= matriu[i].length);
                
            }
            System.out.println("|");
            linia(columnes);          
        }   
    }





    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int fil, col;

        System.out.print("Introdueix les files: ");
        fil = teclado.nextInt(); 

        System.out.print("Introdueix les columnes: ");
        col = teclado.nextInt();  //AQUIII

        int[][] mat = new int[fil][col]; 

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = (int)(Math.random() * (99 - (-99)) + (-99));
            }
        }

        //ES MOSTRA LES FILES I COLUMNES DE LA MATRIU DE DALT AQUEST TEXT!!!
        linia(col);

        //OMPLIM LA MATRIU DE LINEAS I SIMBOLS, AMB LES FILES I COLUMNES DELS RANDOM
        mostrarMatriu(mat);

        teclado.close();
    }
}