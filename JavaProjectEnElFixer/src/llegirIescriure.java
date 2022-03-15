import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class llegirIescriure {
    static Scanner teclat = new Scanner(System.in);

    public static String demanarText(String text) {

        text = teclat.nextLine();
        return text;
    }

    private static void llegirFitxer() {
        String linea;
        try {
            File fitxer = new File("filein2.txt");
            Scanner escanerFitxer = new Scanner(fitxer);

            while (escanerFitxer.hasNextLine()) {
                linea = escanerFitxer.nextLine();
                System.out.println(linea);
            }
            escanerFitxer.close();

        } catch (Exception Error) {
            System.out.println("Error de lectura " + Error.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        String linea;

        llegirFitxer();







        /** 1a FORMA D'ESCRITURE **/
        // demanar a l'usuari linies a escriure al programa
        String linies = "";
        int contadorLinies = 1;
        
        try {

            FileWriter fitxer = null;
            fitxer = new FileWriter("filein2.txt", false);


            while (!linies.equals("FI")) {

                linies = demanarText("Entra text: ");
                fitxer.write(contadorLinies + " - " + linies + "\n");
                contadorLinies++;

            }

            fitxer.close();

        } catch (Exception error) {
            System.out.println("Error inesperat. " + error.getMessage());

        } finally {
            System.out.println("Fi del programa d'escriptura");
            teclat.close();
        }
    }

   
}