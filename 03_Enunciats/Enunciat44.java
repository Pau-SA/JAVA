import java.util.Scanner;

public class Enunciat44 {
    public static void main(String[] args) {


        Scanner teclat = new Scanner(System.in);
        int max = 49;
        int min = 1;
        int numeros;
        int[] papeletas = new int[numeros];
        int[] quantitatBoletosnumeros = new int[6];
        int[] NUMEROSboletos = new int[6];
      

        //PER DEMANAR A L'USUARI QUANTS BOLETOS VOL
        do{
            System.out.print("Quants boletos vols comprar? ");
            numeros = teclat.nextInt();

            if(numeros <= 0){
                System.out.print("ERROR, TORNA-HI");
            }
        }while(numeros <= 0);
       



        // PER INICIAR L'ARRAY I DONAR (N) NÚMEROS ALEATORIS
        do{
            
            for (int i = 0; i < NUMEROSboletos.length; i++) {

                NUMEROSboletos[i]  = (int) (Math.random()*(max-min) + min);
            }
            System.out.println();

        }while(papeletas != 0);
       


        //PER MOSTRAR 

        do{
            for (int i = 0; i < NUMEROSboletos.length; i++) {
                System.out.print( NUMEROSboletos[i] + " ");
            }
    
        }while(papeletas == 0);
       

        teclat.close();
    }
}
