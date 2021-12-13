public class Enunciat29 {
    public static void main(String args[]) throws Exception {


        int[] arrPosicions = new int[5];
        int[] arrPosicionsFinal = new int[5];




        for (int i = 0; i < arrPosicions.length; i++) {
            arrPosicions[i] = (int) (Math.random() * 100);
            // System.out.println("Número: " + arrPosicions[i]);
        }



        for (int i = 0; i < arrPosicions.length; i++) {
            System.out.println("Número: " + arrPosicions[i]);
        }



        for (int i = 0; i < arrPosicions.length; i++) {
            
            
            if (i==arrPosicions.length-1){
                arrPosicionsFinal[0] = arrPosicions[arrPosicions.length - 1];
            } else {
                arrPosicionsFinal[i + 1] = arrPosicions[i];
            }
        }



        System.out.println(" ");




        for (int i = 0; i < arrPosicionsFinal.length; i++) {
            System.out.println(arrPosicionsFinal[i]);
        }
        
    }
    
}
