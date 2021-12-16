public class Enunciat22IMPORTANT {
    public static void main(String args[]) throws Exception {

        int[] array = new int[11];
 
        for (int i=0; i < array.length; i++ ){
            array[i] = (int) Math.pow(2, i);
            
            if(i == 0){
                array[i] = 1;
            }
        }



        for (int i=0; i < array.length; i++ ){
        System.out.println("2 ^ " + i + " = " + array[i]);


        }
    }
}
