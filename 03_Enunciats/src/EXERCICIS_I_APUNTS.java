import java.util.Scanner;

public class EXERCICIS_I_APUNTS {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        

        // System.out.println("0 --> Dilluns");
        // System.out.println("1 --> Dimarts");
        // System.out.println("2 --> Dimecres");
        // System.out.println("3 --> Dijous");
        // System.out.println("4 --> Divendres");
        // System.out.println("5 --> Dissabte");
        // System.out.println("6 --> Diumenge");

        

        // arrLongituds[0] = "Dilluns";
        // arrLongituds[1] = "Dimarts";
        // arrLongituds[2] = "Dimecres";
        // arrLongituds[3] = "Dijous";
        // arrLongituds[4] = "Divendres";
        // arrLongituds[5] = "Dissabte";
        // arrLongituds[6] = "Diumenge";


        String[] arrDies = new String[]{"Dilluns","Dimarts","Dimecres","Dijous","Divendres","Dissabte","Diuemnge"}; 

        for (int i = 0; i < arrDies.length; i++) {
            System.out.println("El dia " + (i + 1)  + " es " + arrDies[i]);

        }


        //LA (I), ENS MOSTRA/RECORRA LA PARAULA. LA (J), ENS MOSTRA/RECORRA CADA LLETRA DE LA PARAULA

            //EL QUE MOSTRA EL SYSOUT AQUEST
                // El dia 1 es Dilluns
                // El dia 2 es Dimarts
                // El dia 3 es Dimecres
                // El dia 4 es Dijous
                // El dia 5 es Divendres
                // El dia 6 es Dissabte
                // El dia 7 es Diuemnge


        int[] arrNumSet = new int[6];
        int numero;

        System.out.print("Ara, entra un dia de la setmana en numero: ");
        numero = teclat.nextInt();

        for (int i = 0; i < arrDies.length; i++) {
            if(arrNumSet.length == arrDies.length){
                

            }
        }   




        teclat.close();

    }
}
