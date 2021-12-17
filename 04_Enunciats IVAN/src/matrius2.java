import java.util.Scanner;

public class matrius2 {
    public static void main(String[] args) {

        //NECESITEM CREAR UN PROGRAMA PER REGITRAR SOUS D'HOMES I DE DONES, D'UNA EMPRESA I DETECTAR SI EXISTEIX, SI HI HA DIFERENCIA DE SOU ENTRE HOMES I DONES
        //EL PROGRAMA DEMANRA PER TECLAT LA INFORMACIO DE (N), EMPLEATS A LA EMPRESA
        //DEMANAR QUANST EMPLEATS HI HA  A LA EMPRESA//
        //per cada persona demanarem, el seu genere i el seu sou
        //aquesta info, s'ha de guardar en una única matriu
        //despres, es mostrarà, el sou mitg de cada genere
        Scanner teclat = new Scanner(System.in);


        int empleats = 0; //la N es la quantitat de empleats
        Double sou;
    

        //DEMANAR INFO
        System.out.print("Entra quanst empleats hi ha: "); 
        empleats=teclat.nextInt();
        int[][] taula = new int[empleats][2];  
        int contadorgenere[] = new int[empleats];


        //PER DEMANAR LA INFO DE LA TAULA
        for (int i = 0; i < taula.length; i++) {

            System.out.print("Entra el sexe: "); 
            taula[i][0]=teclat.nextInt();
    
            System.out.print("Entra el sou: ");
            taula[i][1]=teclat.nextInt();
            
        }


        for (int i = 0; i <taula.length; i++){

            taula[i][0]=empleats++;
            taula[i][0]= ()/empleats[0];


            


        }


    }
}
