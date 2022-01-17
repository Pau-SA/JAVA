import java.util.Scanner;

public class Enunciat44PROVA {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int nPapeletes;

        // PER DEMANAR A L'USUARI QUANTS BOLETOS VOL
        do {
            System.out.print("Entra quantes papeletes vols: ");
            nPapeletes = teclat.nextInt();
            if (nPapeletes <= 0) {
                System.out.print("ERROR, TORNA-HI");
            }
        } while (nPapeletes <= 0);




        final int max = 49;
        final int min = 1;
        int numeroescollit = 0;
      


        //PER OMPLIR LES PAPELETES
        int[][] NUMEROSboletos = new int[nPapeletes][6];
        int[] NUMEROSboletosRandom = new int[6];
        System.out.println();
        
        for (int i = 0; i < NUMEROSboletos.length; i++) {
            for (int j = 0; j < NUMEROSboletos[i].length; j++) {
                System.out.print("Entra numero ");

                NUMEROSboletos[i][j] = teclat.nextInt();

                if ((NUMEROSboletos[i][j] < min) || (NUMEROSboletos[i][j] > max)) {
                    System.out.println("ERROR, TONRA-HI");
                }
            }
        }

        System.out.println();
        System.out.println("Les apostes son: ");
        for (int i = 0; i < NUMEROSboletos.length; i++) {
            for (int j = 0; j < NUMEROSboletos[i].length; j++) {

                System.out.print(NUMEROSboletos[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println(" ");


        //PER FER L'ARRAY GUANYADORA AMB NÚMEROS RANDOM
        for (int i = 0; i < NUMEROSboletosRandom.length; i++) {
            NUMEROSboletosRandom[i] = (int) (Math.random() * (max - min) + min);

        }

        System.out.println("Papeleta Guanyador");
        for (int i = 0; i < NUMEROSboletosRandom.length; i++) {
            System.out.print(NUMEROSboletosRandom[i]);
            System.out.print(" ");  

        }
      

        //PER DIR QUANTS NUMEROS HAN COINCIDIT
        for (int i = 0; i < NUMEROSboletos.length; i++) {
            for (int j = 0; j < NUMEROSboletos[i].length; j++) {

                if(NUMEROSboletos[i][j] == NUMEROSboletosRandom[i]){
                    numeroescollit++;
                }
            }
        }

        if(numeroescollit == 6){
            System.out.println("Enhorabona has guanyat el premi maxim!");
        }


        System.out.println(" ");
        System.out.println("Has encertat " + numeroescollit + " numeros, enhorabona ;)");



        teclat.close();

    }
}