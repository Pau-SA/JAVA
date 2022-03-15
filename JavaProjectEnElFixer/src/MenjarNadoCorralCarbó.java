import java.io.File;
import java.util.Scanner;

//  ____       _      _   _      ____    ___    ____    ____       _      _         ___     __  __      _      ____     ____      ____      _      ____    ____     ___  
// |  _ \     / \    | | | |    / ___|  / _ \  |  _ \  |  _ \     / \    | |       |_ _|   |  \/  |    / \    |  _ \   / ___|    / ___|    / \    |  _ \  | __ )   / _ \ 
// | |_) |   / _ \   | | | |   | |     | | | | | |_) | | |_) |   / _ \   | |        | |    | |\/| |   / _ \   | |_) | | |       | |       / _ \   | |_) | |  _ \  | | | |
// |  __/   / ___ \  | |_| |   | |___  | |_| | |  _ <  |  _ <   / ___ \  | |___     | |    | |  | |  / ___ \  |  _ <  | |___    | |___   / ___ \  |  _ <  | |_) | | |_| |
// |_|     /_/   \_\  \___/     \____|  \___/  |_| \_\ |_| \_\ /_/   \_\ |_____|   |___|   |_|  |_| /_/   \_\ |_| \_\  \____|    \____| /_/   \_\ |_| \_\ |____/   \___/ 

public class MenjarNadoCorralCarbó {

    static final int MIDAARRAY = 12;

    static String[] agrada = new String[MIDAARRAY];
    static String[] noAgrada = new String[MIDAARRAY];

    static int contadorSi = 0;
    static int contadorNo = 0;

    static File fitxer = new File("./fitxer.txt");

    static Scanner teclat;

    public static boolean existeix(String array[], String element) {
        boolean siExisteix = false;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i].equals(null))) {

                if (array[i].equals(element)) {
                    siExisteix = true;
                    break;
                }
            }
        }
        return siExisteix;
    }

    public static void afegirArray(String ingredient, int opcio) {
        if (opcio == 0) {
            if (contadorSi == 0) {
                agrada[contadorSi++] = ingredient;
            } else {
                if (existeix(agrada, ingredient) != true) {
                    agrada[contadorSi++] = ingredient;
                }
            }
        } else {
            if (contadorNo == 0) {
                noAgrada[contadorNo++] = ingredient;
            } else {
                if (existeix(noAgrada, ingredient) != true) {
                    noAgrada[contadorNo++] = ingredient;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        teclat = new Scanner(fitxer);
        String text;
        String[] ingredients = new String[MIDAARRAY];

        try {
            while (teclat.hasNextLine()) {

                text = teclat.nextLine();
                ingredients = text.split(" ");

                for (int i = 1; i < ingredients.length - 1; i++) {
                    System.out.println(ingredients[i] + " ");
                    // afegirArray(textSeparat[i], textSeparat[0].equals("SI:") ? 0 : 1);
                    afegirArray(ingredients[i], ingredients[0].equals("SI:") ? 0 : 1);
                }

            }

            // System.out.println("AGRADA");
            // mostrarArray(agrada);
            // System.out.println("NO AGRADA");
            // mostrarArray(noAgrada);
            // System.out.println();

            // System.out.println();
            // System.out.print("LI AGRADA ");
            // for (int i = 0; i < MIDAARRAY; i++) {
            // if (agrada[i] != null)
            // System.out.print(agrada[i] + " ");
            // else {
            // break;
            // }
            // }

            // System.out.println();
            // System.out.print("NO LI AGRADA ");

            boolean coincidencia = false;
            for (int i = 0; i < noAgrada.length; i++) {
                for (int j = 0; j < agrada.length; j++) {
                    // if ((noAgrada[i] != null && agrada[j] != null && noAgrada[i] == agrada[j])) {
                    if ((noAgrada[i] == agrada[j])) {
                        noAgrada[i] = " ";
                        coincidencia = true;
                    } else {
                        coincidencia = false;
                    }

                }
            }

        } catch (Exception e) {
            // TODO: handle exception

        }

        System.out.println();
        mostrarArray(agrada);
        System.out.println();
        mostrarArray(noAgrada);
    }

    private static void mostrarArray(String[] arrayRebut) {
        for (int i = 0; i < MIDAARRAY; i++) {
            if (arrayRebut[i] != null)
                System.out.print(arrayRebut[i] + " ");
            else
                break;
        }
    }
}