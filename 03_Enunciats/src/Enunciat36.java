
public class Enunciat36 {
    public static void main(String args[]) throws Exception {

        char[] arrParaula = { 'p', 'r', 'o', 'g', 'r','a', 'm', 'a' };
        char[] arrText = { 'f', 'g', 'n', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'u', 'a' };
        int pos1 = 0, pos2 = 0;
        int oks = 0;

        System.out.println("Donada la paraula donada contem les posicions de:  " );

        for (int i = 0; i < arrText.length; i++) {
            if (oks < arrParaula.length)
            {
                if(arrText[i] == arrParaula[oks]){
                    if (oks == 0) pos1 = i;
                    else if (oks == arrParaula.length-1) pos2 = i;
    
                    oks++;
                }
                else
                {
                    oks = 0;
                }
            }
        }
        System.out.println("Es troba entre " + pos1 + " i " + pos2);
    }
}
