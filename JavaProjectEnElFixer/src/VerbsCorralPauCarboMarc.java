import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


//  ____       _      _   _      ____    ___    ____    ____       _      _         ___     __  __      _      ____     ____      ____      _      ____    ____     ___  
// |  _ \     / \    | | | |    / ___|  / _ \  |  _ \  |  _ \     / \    | |       |_ _|   |  \/  |    / \    |  _ \   / ___|    / ___|    / \    |  _ \  | __ )   / _ \ 
// | |_) |   / _ \   | | | |   | |     | | | | | |_) | | |_) |   / _ \   | |        | |    | |\/| |   / _ \   | |_) | | |       | |       / _ \   | |_) | |  _ \  | | | |
// |  __/   / ___ \  | |_| |   | |___  | |_| | |  _ <  |  _ <   / ___ \  | |___     | |    | |  | |  / ___ \  |  _ <  | |___    | |___   / ___ \  |  _ <  | |_) | | |_| |
// |_|     /_/   \_\  \___/     \____|  \___/  |_| \_\ |_| \_\ /_/   \_\ |_____|   |___|   |_|  |_| /_/   \_\ |_| \_\  \____|    \____| /_/   \_\ |_| \_\ |____/   \___/ 
                                                                                                                                                                      
public class VerbsCorralPauCarboMarc {

    static Scanner teclat = null;

    static String[][] verbDictonari = {
            { "jo salto\ntu saltes\nell salta\nnosaltres saltem\nvosaltres salteu\nells salten",
                    "jo he saltat\ntu has saltat\nell ha saltat\nnosaltres hem saltat\nvosaltres heu saltat\nells han saltat",
                    "jo saltare\ntu saltaras\nell saltarà\nnosaltres saltarem\nvosaltres saltareu\nells saltaran" },
            { "jo menjo\ntu menges\nell menja\nnosaltres mengem\nvosaltres mengeu\nells mengen",
                    "jo he menjat\ntu has menjat\nell ha menjat\nnosaltres hem menjat\nvosaltres heu menjat\nells han menjat",
                    "jo menjare\ntu menjaras\nell saltara\nnosaltres menjareu\nvosaltres menjareu\nells menjaran" },
            { "jo visc\ntu vius\nell viu\nnosaltres vivim\nvosaltres viviu\nells viuen",
                    "jo he viscut\ntu has viscut\nell ha viscut\nnosaltres hem viscut\nvosaltres hey viscut\nells han viscut",
                    "jo viure\ntu viuras\nell viura\nnosaltres viurem\nvosaltres viureu\nells viuran" }
    };

    //declarem la variable per escriure en el arxiu
    static FileWriter sortida = null;

    //declarem la variable per llegir en el arxiu
    static File entrada = null;


    static String[] parulesDefault = { "saltar", "menjar", "viure" };

    static char[] tempsVerb = { 'P', 'A', 'F' };

    static void clearFile() {
        try {
            sortida = new FileWriter("./fileout.text", false);
            sortida.write("");
            sortida.close();

        } catch (Exception e) {
            System.out.print("Error " + e + "\n");
        }
    }



    //aixo es per esciure
    static void writeFile(String text) {
        try {
            sortida = new FileWriter("./fileout.text", true);
            sortida.write(text);
            sortida.close();

        } catch (Exception e) {
            System.out.print("Error " + e + "\n");
        }
    }


    private static int triaTemps (char temps){

        for (int i = 0; i < tempsVerb.length; i++) {
            if(tempsVerb[i] == temps) return i;
        }

        return(0);
    }






    public static void main(String[] args) throws Exception {

        int verbIndex = 0;
        char tempsVerbal = ' ';
        String verbActual = "";
    

        clearFile();

        try {
            entrada = new File("./filein.text");

            //posem entrada, perque volem que ens llegeixi el filein.text
            teclat = new Scanner(entrada);


            while(teclat.hasNextLine()){ 
                String dades = teclat.nextLine();

                //aixo es per separar les dades en un array (ex: Pau T), Pau = 0, i T = 1
                String[] array = dades.split(" ");
                verbActual = array[0];
                tempsVerbal = array[1].charAt(0);

                //aixo es per si ens trobem la T, el programa acaba
                if(tempsVerbal == 'T')break;


                verbIndex = triaTemps(tempsVerbal);

                for (int i = 0; i < parulesDefault.length; i++) {

                    if(verbActual.equals(parulesDefault[i]));
                    
                        //verbIndex cridem la variable de dalt
                        writeFile(verbDictonari[i][verbIndex]);

                }   
          


            }
        teclat.close();
            
        } catch (Exception e) {
            System.out.print("Error: " + e + "\n");
        }


        System.out.println("Fi del programa d'escriptura en fitxer.");
    }
}
