import java.util.Scanner;

public class Enunciat26 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        final int MIDA = 6;
        String[] arrayinicial = new String[MIDA];
        char[] abecedari = {'a', 'b', 'c', 'd', 'e', 'f', 'g' ,'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'y', 'z'};
        String[] frasesordre = new String[arrayinicial];
        

        // arrayInicial[0]="En un lugar de la Mancha, de cuyo nombre no quiero acordarme"
        // arrayInicial[1]="no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero"
        // arrayInicial[2]="adarga antigua, rocín flaco y galgo corredor."
        // arrayInicial[3]="Una olla de algo más vaca que carnero, salpicón las más noches"
        // arrayInicial[4]="duelos y quebrantos los sábados, lantejas los viernes, algún palomino"
        // arrayInicial[5]="de añadidura los domingos, consumían las tres partes de su hacienda."
        


        for (int i = 0; i < arrayinicial.length; i++) {
            System.out.print("Entra 6 cadenes de text: ");
            arrayinicial[i] = teclat.next().toLowerCase();

            for (int j = 0; j < arrayinicial.length; j++) {

                if(arrayinicial[i].charAt(0) == abecedari){

                    if (arrayinicial[i].charAt(1) == 'a') {
                        frasesordre++;
    
                    } else if (arrayinicial[i].charAt(2) == 'e') {
                        frasesordre++;
    
                    } else if (arrayinicial[i].charAt(3) == 'i') {
                        frasesordre++;
    
                    } else if (arrayinicial[i].charAt(j) == 'o') {
                        frasesordre++;
    
                    } else if (arrayinicial[i].charAt(j) == 'u') {
                        frasesordre++;
    
                    }


                }
            }


        }


        teclat.close();



    }
}
