import java.io.FileWriter;
import java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) throws Exception {

        Scanner teclat = new Scanner(System.in);
        FileWriter fitxer = null;
        String txt="";
        int contadorLinies;


        try{

            fitxer = new FileWriter("fitxer.txt",true);
            contadorLinies = 1;

            while (!txt.equals("FI")){
                System.out.println("Introdueix el text per la linea " + contadorLinies);
                txt = teclat.nextLine();
                fitxer.write(contadorLinies + " + " + txt + "\n");
                contadorLinies++;
            }

            fitxer.close();

        }catch (Exception error){//on posar "error", podem posar el que vulguem. Serveix per si falla lo de dalt
            System.out.println("Error inesperat. " + error.getMessage());
        }

        System.out.println("Fi del progarma d'espriptura");
        teclat.close();


    }
}