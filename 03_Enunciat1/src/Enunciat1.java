import java.util.Scanner;

public class Enunciat1 {
    public static void main(String[] args) throws Exception {
        double base, altura, hipotenusa;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra la base del triangle ");
        base = teclat.nextInt();

        System.out.print("entra la alçada del triangle ");
        altura = teclat.nextInt();


        hipotenusa = (float) Math.sqrt(Math.pow(base,2) + (Math.pow(altura,2)));
        
        //hipotenusa = sqrt (base^2 + altura^2)
        //pow = a^b
        //sqrt = arrel quadrada
        //abs = valor absolut

        System.out.println("La Hipotenusa del triangle es " + hipotenusa);

       
        

        teclat.close();


    }
}
