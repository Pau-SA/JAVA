
// import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) throws Exception {
        Scanner reader = null ;

        Scanner teclat = new Scanner(System.in);
        final int MIDA = 5;

        float[] preuMesGran = new float[MIDA];
        float[] preuMesBaix = new float[MIDA];
        char[] Codi = new char[MIDA];
        String[] Categories = new String[MIDA];
        FileWriter fitxer = null;
        float[] numeros = new float[MIDA];

        

        Codi[0] = 'E';
        Codi[1] = 'D';
        Codi[2] = 'B';
        Codi[3] = 'S';
        Codi[4] = 'C';

        Categories[0] = "Esmorzar";
        Categories[1] = "Dinar";
        Categories[2] = "Berenar";
        Categories[3] = "Sopar";
        Categories[4] = "Copes";


        String txt="";
        int contadorLinies; 
        float mitjana = 0;
        String frase;

        try{

            fitxer = new FileWriter("file.txt",true);
            contadorLinies = 1;

            while (!txt.equals("FI")){
                fitxer.write(preuMesGran + " # " + preuMesBaix + " # " + mitjana);
                contadorLinies++;

                //ARA VULL LLEGIR LA PRIMERA LLETRA DEL .TXT, PERQUE FENT AIXÒ ENS LLEGIRA TOTES LES LINIES


                for (int i = 0; i < Codi.length; i++) {
                 System.out.println(numeros);
                 
                    if(frase.charAt(0) == Codi[i]){
                        numeros[i] = Float.parseFloat(frase.substring(2));
                    }
                }

                fitxer.close();
            }



        }catch (Exception error){//on posar "error", podem posar el que vulguem. Serveix per si falla lo de dalt
            System.out.println("Error inesperat: " + error.getMessage());
        }
            System.out.println("Fi del progarma d'espriptura");
        // teclat.nextDouble();



    }
}
