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

        
        public static Scanner teclat = new Scanner(System.in);

    public static void mostrarMissatge(String cadena) {
        System.out.println(cadena); 
    }
    public static int llegirEnterTeclat() {
        int num = 0;
        boolean numIncorrecte = false;
        do {
            try {
                numIncorrecte = false;
                System.out.print("Digues un numero: ");
                num = teclat.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR! Nomes pots posar numeros");
                numIncorrecte = true;
                teclat.nextLine();
            }
        } while (numIncorrecte != false);
        return num;
    }

    public static char llegirCaracterTeclat() {
        int nombre;
        nombre = llegirEnterTeclat();
        char caracter = (char) nombre;
        return caracter;
    }

    public static String llegirCadenaDeLletresTeclat() {
        String cadena = teclat.nextLine();
        return cadena;
    }

    public static boolean esEnter(char valorLlegit) {
        boolean esEnter = false;
        if (valorLlegit > 48 && valorLlegit < 57) {
            esEnter = true;
        }
        return esEnter;
    }

    public static boolean esLletra(char valorLlegit){
        boolean esLletra = false;
        if (valorLlegit > 65 && valorLlegit < 90) {
            esLletra = true;
        }
        if (valorLlegit > 97 && valorLlegit < 122) {
            esLletra = true;
        }
        return esLletra;
    }

    public static void mostrarMissatgeSaltLinea(String cadena, boolean salt){
        if (salt == true) {
            System.out.println(cadena);
        } else {
            System.out.print(cadena);
        }
    }


        String cadena = Mcg20220121.teclat.nextLine(); 

        Mcg20220121.mostrarMissatge(cadena); 

        Mcg20220121.llegirEnterTeclat();

        Mcg20220121.llegirCaracterTeclat();

        System.out.println(Mcg20220121.llegirCadenaDeLletresTeclat());

        System.out.println(Mcg20220121.esEnter(Mcg20220121.llegirCaracterTeclat()));

        System.out.println(Mcg20220121.esLletra(Mcg20220121.llegirCaracterTeclat()));

        Mcg20220121.mostrarMissatgeSaltLinea(cadena, false);

    }
}
