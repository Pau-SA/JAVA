public class Enunciat12{
    /*
     * Fer un programa en Java que escrigui els nombres senars del 100 al 0. Només
     * es pot fer servir, la sentencia for.
     */
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) { // i-- -> i = i - 1
            if (i % 2 != 0) { // És senar != (sino es igual a 0)
                System.out.println(i);
            }
        }
    }
}