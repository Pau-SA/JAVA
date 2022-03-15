import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class RestaurantCorralPau {
    public static void main(String[] args) throws Exception {
        Scanner reader = null ;

        Scanner teclat = new Scanner(System.in);
        final int MIDA = 5;

        float preuMesGran = 0;
        float preuMesBaix = 1000;
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

        String text="";
        float mitjanatotal = 0;
        float mitjanasensecopes = 0;

        String frase;

        try{

            File LlegirFitxer = new File("fileCorralPau.text");
            java.util.Scanner fileScanner = new Scanner (LlegirFitxer);

            while (fileScanner.hasNextLine()){
                frase = fileScanner.nextLine();

                for (int i = 0; i < Codi.length; i++) {                 
                    if(frase.charAt(0) == Codi[i]){
                        numeros[i] = Float.parseFloat(frase.substring(2));
                        if(numeros[i] > preuMesGran){
                            preuMesGran = numeros[i];
                        }if (numeros[i] < preuMesBaix){
                            preuMesBaix = numeros[i];
                        }
                    }
                }
                System.out.println(frase);



                //on esta numeros[i], la i abans li hem dit que començi en 0, cada volta va sumant
                //SI es 0+0=0 --> 1+0=1 --> 2+0=2 ....
                float suma = 0;
                for (int i = 0; i < numeros.length; i++) {  
                    suma =  numeros[i] + suma;
                }
                mitjanatotal = suma / 5;


                //el lenght -1, es per reststarli una posició, en aquest cas, li restem les copes
                float sumasensecopes = 0;
                for (int i = 0; i < numeros.length - 1; i++) {  
                    sumasensecopes =  numeros[i] + sumasensecopes;
                }
                mitjanasensecopes = sumasensecopes / 4;
            }
            

            System.out.println(" ");
            

            if(mitjanatotal>mitjanasensecopes){
                System.out.print("COMIDAS" + " # " + "COPAS" + " # " + "SI");

            }else if(mitjanatotal<mitjanasensecopes){
                System.out.print("COPAS" + " # " + "COMIDAS" + " # " + "NO");

            }else{
                System.out.print("COPAS/COMIDAS" + " # " + "COMIDAS/COPAS" + " # " + "EMPAT");
            }

            fileScanner.close();



            System.out.println(" ");
            System.out.println("La categoria que te el preu més car es de " + preuMesGran + " i la que té menys " + preuMesBaix);
            System.out.println("La mitjana de preu de apats es: " + mitjanatotal);
            System.out.println("La mitjana del menú SENSE copes es: " + mitjanasensecopes);


        }catch (Exception error){//on posar "error", podem posar el que vulguem. Serveix per si falla lo de dalt
            System.out.println("Error inesperat: " + error.getMessage());
        }

        System.out.println(" ");
        System.out.println("Fi del progarma d'espriptura");
    }
}