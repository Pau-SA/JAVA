import java.util.Scanner;

public class Enunciat27 {
    public static void main(String args[]) throws Exception {
		Scanner teclat = new Scanner(System.in);

        int[] arrayNombres = new int[5];
        int[] arrResultat = new int[5];
        int Valormespetit;
        int Valormesgran;


        System.out.println("Entra el valor més petit");
        Valormespetit = teclat.nextInt();

        System.out.println("Entra el valor mes gran");
        Valormesgran = teclat.nextInt();

        // FOR per inicialitzar array
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i] = (int) (Math.random() * 100);
        }


        System.out.println("ABANS!");


        // FOR per mostrar array abans de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }




        // FOR per processar l'array
        for (int i = 0; i < arrayNombres.length; i++) {

            for (int j = i + 1; j < arrayNombres.length; j++) {

                if(arrayNombres[i] < Valormespetit){
                    arrResultat[i] = 0;
                }else if (arrayNombres[i] > Valormesgran){
                    arrResultat[i] = 1;
                }else if(arrResultat == arrayNombres){
                    arrayNombres[i] = arrResultat[i];
                }
            }
        }


        System.out.println("DESPRES!");
        // FOR per mostrar array despres de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrResultat[i]);
        }


        teclat.close();
    }
}