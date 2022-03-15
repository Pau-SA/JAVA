import java.io.File;
import java.util.Scanner;

public class Exemple2 {
    public static void main(String[] args) throws Exception {


        String linea;

        try{
            File fitxer = new File ("fitxer.text");
            Scanner escanerFitxer = new Scanner(fitxer);

            while (escanerFitxer.hasNextLine()){
                linea = escanerFitxer.nextLine();
                System.out.println(linea);
            }   
            escanerFitxer.close();

        }catch (Exception Error){
            System.out.println("Error de lectura " + Error.getMessage());
        }
    }
}