public class Enunciat22 {
    public static void main(String args[]) throws Exception {

        int[] array = new int[11];
 
        for (int i=0; i < array.length; i++ ){
            array[i] = (int) Math.pow(2, i);
            System.out.println("2 ^ " + i + " = " + array[i]);
        }


    }
}
