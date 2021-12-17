import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) throws Exception {
    
            Scanner teclat = new Scanner(System.in);
            final int MIDA = 5;
    
            float[] preuMesGran = new float[MIDA];
            float[] preuMesBaix = new float[MIDA];
            String[] Codi = new String[MIDA];
            String[] Categories = new String[MIDA];
            FileWriter fitxer = null;
            String txt="";
            int contadorLinies;
            float mitjana;
    
            Codi[0] = "E";
            Codi[1] = "D";
            Codi[2] = "B";
            Codi[3] = "S";
            Codi[4] = "C";
    
            Categories[0] = "Esmorzar";
            Categories[1] = "Dinar";
            Categories[2] = "Berenar";
            Categories[3] = "Sopar";
            Categories[4] = "Copes";
    
    
    
            try{
    
                fitxer = new FileWriter("fitxerRestaurant.txt",true);
                contadorLinies = 1;
    
                while (!txt.equals("FI")){
                    System.out.println("Introdueix el text per la linea " + contadorLinies);
                    txt = teclat.nextLine();
                    fitxer.write(preuMesGran + " # " + preuMesBaix + " # " + mitjana);
                    contadorLinies++;
    
                    for (int i = 0; i < Codi.length; i++) {
    
                        
                        
                    }
    
                fitxer.close();
    
            }catch (Exception error){//on posar "error", podem posar el que vulguem. Serveix per si falla lo de dalt
                System.out.println("Error inesperat. " + error.getMessage());
            }
            System.out.println("Fi del progarma d'espriptura");
         
    
            teclat.nextDouble();
    
    
    
            }
        }
}


