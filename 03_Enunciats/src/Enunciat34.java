public class Enunciat34 {
    public static void bubbleSort(int[] a) {

    }

    public static void main(String args[]) throws Exception {

        
        int[] arrM = {3,7,13,19};
        int[] arrN = {8,10,12};
        int[] arrResultat = new int[arrM.length + arrN.length];

        System.out.println(" ");
        System.out.println("EXERCICI NÚMEROS DE DESORDENATS --> ORDENATS");
        System.out.println(" ");


        for (int i = 0; i < arrResultat.length; i++){
            // System.out.print(i + "\n");
            if (i < arrM.length) //SI LA [I] ES MÉS PETITA QUE LA LONGITUD DE L'ARRAY M...
                arrResultat[i] = arrM[i];
            else
                arrResultat[i] = arrN[i - arrM.length];

            System.out.print("Array Desordenat: " + arrResultat[i]+"\n");
        }



        //AIXÒ ES PER ORDENAR L'ARRAY PILLAT DE GOOGLE
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrResultat.length - 1; i++) {
                if (arrResultat[i] > arrResultat[i+1]) {
                    temp = arrResultat[i];
                    arrResultat[i] = arrResultat[i+1];
                    arrResultat[i+1] = temp;
                    sorted = false;
                }
            }
        }



        System.out.print("\n");

        for (int i = 0; i < arrResultat.length; i++){
            System.out.println("Resultat Ordenat: " + arrResultat[i]);
        }

    }
}
