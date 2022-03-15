import java.util.Scanner;

public class Enunciat23 {
    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);

        final int MIDA = 5;   
        int[] arrLongituds = new int[MIDA];

        String[] arrCadenes = new String[MIDA];

        arrCadenes[0] = "En un lugar de la Macha";
        arrCadenes[1] = "de cuyo nombre no quiero acordarme";
        arrCadenes[2] = "no ha mucho tiempo que vivía un hidalgo";
        arrCadenes[3] = "de los de lanza en astillero";
        arrCadenes[4] = "adarga antigua, rocín flaco y galgo corredor";
        //AQUIIIIIIII


        // FOR procesament de dades
        for (int i = 0; i < arrCadenes.length; i++) { 
            arrLongituds[i] = arrCadenes[i].length();
        }

        
        // FOR sortida de dades
        for (int i = 0; i < arrCadenes.length; i++) {
            System.out.println("A la pos " + i + " = " + arrCadenes[i] + " té " + arrLongituds[i] + " caracters.");
        }                       //A LA POS i = [0] O [1] D'AQUIIIIIII
        teclat.close();


    }
}