import java.io.FileWriter;
import java.util.Scanner;

public class Exemple1Prova {
    static Scanner teclat;

    static String demanarText(String text){

        text = teclat.next();
        return text;
    }





    public static void main(String[] args) throws Exception {

        // demanar a l'usuari linies a escriure al programa
        String linies = "";
        int contadorLinies = 1;

        try{

            FileWriter fitxer = null;
            fitxer = new FileWriter("fileout.txt");

            while(!linies.equals("FI")){

                linies = demanarText("Entra text: ");
                fitxer.write(contadorLinies + " - " + linies + "\n");
                contadorLinies++;
                
            }

            fitxer.close();

        }catch(Exception error){
            System.out.println("Error inesperat. " + error.getMessage());

        }finally{
            System.out.println("Fi del programa d'escriptura");
            teclat.close();
        }
    }
}