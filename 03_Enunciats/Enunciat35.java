public class Enunciat35 {
    
    public static void main(String args[]) throws Exception {

        int[] arrM = {3,7,13,19};
        int[] arrN = {8,10,12};
        boolean esDiferent = true;


        for (int i = 0; i < arrM.length; i++){
            System.out.println("Primera array M té: " + arrM[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < arrN.length; i++){
        System.out.println("Segona array N té: " + arrN[i]);
        }

        

        
        for (int i = 0; i < arrM.length; i++){

            if(arrN.length != arrM.length){
                System.out.println("Les arrays son de diferent tamany");
                esDiferent = true;
                break;

            }else if(arrN.length == arrM.length){
                System.out.println("Les arrays son iguals");
                esDiferent = false;
            }
        }
    }
}