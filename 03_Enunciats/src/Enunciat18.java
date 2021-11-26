import java.util.Scanner;

public class Enunciat18 {
    public static void main(String args[]) throws Exception {
        Scanner teclatnumeros = new Scanner(System.in);
        Scanner teclatlletres = new Scanner(System.in);
        int contador = 0;
        int edat;
        Character sexe;
        int totalhomes = 0;
        int totaldones = 0;


        

        do{

            
            do{
                System.out.println("Entra el teu sexe: ");
                sexe = teclatlletres.next().charAt(0);
    
    
                if (!( (sexe.equals('M') || (sexe.equals('H') )  ) ) ) {
                    System.out.println("ERROR, entra un altre cop!! ");
                }

             
                if (sexe == 'M'){
                    totalhomes = totalhomes + 1;
                }

                if (sexe == 'H'){
                    totaldones = totaldones + 1;
                }
                
                
                // System.out.println("El teu sexe es:  " + sexe);
    
                
                System.out.println("Entra la teva edat");
                edat = teclatnumeros.nextInt();
    
                if (edat < 0 ){
                    System.out.println("ERROR, posa una edat valida"); 
    
                }
                
                if (edat < 18 ){
                    System.out.println("No pots entrar a la discoteca PENDEJO ");
                    
                }else{ 
                    contador = contador + 1;
                }



            }while  ((edat >= 0 )  || (!(sexe.equals('M') || sexe.equals('H'))));


        }while ((edat >= 0) || (!(sexe.equals('M') || sexe.equals('H'))));

        System.out.println("A la discoteca poden " + contador);

       
        teclatlletres.close();
        teclatnumeros.close();




    }
}
       

    


