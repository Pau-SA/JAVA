public class Enunciat32 {

    public static void main(String args[]) throws Exception {

        int[] arrPosicions = new int[5];
        int[] arrResultat = new int[5];
        int nombregran = 0;

        for (int i = 0; i < arrPosicions.length; i++) {
            arrPosicions[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arrPosicions.length; i++) {
            System.out.println("Número: " + arrPosicions[i]);
        }

        for (int i = 0; i < arrPosicions.length - 1; i++) {

            arrResultat[i] = Math.abs(arrPosicions[i] - arrPosicions[i + 1]) ;
                
            if(arrResultat[i] > nombregran){
                nombregran = arrResultat[i];
            }
        }

        System.out.println(" ");

        for (int i = 0; i < arrPosicions.length; i++) {
            System.out.println("Resultat: " + arrResultat[i]);
        }

        System.out.println(" ");

        // DONAR PER PANTALLA EL RESULTAT DE LES OPERACIONS
            System.out.println("La diferencia maxima es: "+ nombregran);


    }
}
