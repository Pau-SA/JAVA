import java.util.Scanner;

public class Enunciat6 {
    public static void main(String[] args){
        
        Scanner teclat = new Scanner(System.in);
        
        int diaSetmana;


        do {
            System.out.print("Introdueix el número de dia de la setmana: ");
            diaSetmana = teclat.nextByte();
            if ((diaSetmana <= 0) || (diaSetmana >= 8)) {
                System.out.println("ERROR! Torna a intentar-ho!");
            }
        } while ((diaSetmana <= 0) || (diaSetmana >= 8));



        
        String[] nomsDiaSetmana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres, Dissabte, Diumenge"}; 

        System.out.println("El dia de la setmana escollit es:  " + nomsDiaSetmana[diaSetmana -1]);

    }
}






















