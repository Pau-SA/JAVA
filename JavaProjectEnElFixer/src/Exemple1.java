import java.io.FileWriter;
import java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) throws Exception {

        Scanner teclat = new Scanner(System.in);
        String text="";
        int contadorLinies = 1;

        try{
            FileWriter fitxer = null;
            fitxer = new FileWriter("fileout.txt",true);

            while (!text.equals("FI")){
                System.out.print("Introdueix el text per la linea " + contadorLinies + ": ");
                text = teclat.nextLine();
                fitxer.write(contadorLinies + " -" + text + "\n");
                contadorLinies++;
            }

            fitxer.close();

        }catch (Exception error){//on posar "error", podem posar el que vulguem. Serveix per si falla lo de dalt
            System.out.println("Error inesperat. " + error.getMessage());
        }finally{
            System.out.println("Fi del progarma d'espriptura");
            teclat.close();
        }
    }
}