import java.util.Scanner;

public class Enunciat45 {

    static Scanner teclat = new Scanner(System.in);

//PER COMPROBAR ELS NUMEROS
    static int demanaNombre(String frase) {
        int numeroLlegit = 0;
        boolean nombreIncorrecte = false;
        do {
            try {
                nombreIncorrecte = false;
                System.out.print(frase);
                numeroLlegit = teclat.nextInt();
            } catch (Exception e) {
                System.out.println("Només pots entrar nombres,"
                        + " torna a intentar-ho!");
                nombreIncorrecte = true;
                teclat.nextLine(); // Netejem el buffer d'entrada
            }
        } while (nombreIncorrecte != false);
        return numeroLlegit;
    }


//PER FER LA SUMA   
    static int suma(int numero1, int numero2){
        int operaciosuma = 0;

        operaciosuma = numero1 + numero2;

        return operaciosuma;
    }

//PER FER LA RESTA
    static int resta(int numero1, int numero2){
        int operacioresta = 0;

        operacioresta = numero1 - numero2;

        return operacioresta;
    }

//PER FER LA MULTIPLICACIO
    static int multi(int numero1, int numero2){
        int operaciomulti = 0;

        operaciomulti = numero1 * numero2;

        return operaciomulti;
    }


//PER FER LA DIVISIO
    static float divi(int numero1, int numero2){
        float operaciodivi = 0;

        operaciodivi = numero1 / numero2;

        return operaciodivi;
    }



    public static void main(String[] args) {
        int num1 = demanaNombre("Entra el numero 1: ");
        int num2 = demanaNombre("Entra el numero 2: ");
        int resultatOperacioSuma;
        int resultatOperacioResta;
        int resultatOperacioMulti;
        float resultatOperacioDivi;


        System.out.println("Has entrat el número " + num1 + " i el " + num2);


//PER MOSTRAR EL RESULTAT DE LES FUNCIONS ANTERIORS
        resultatOperacioSuma = suma(num1, num2);
        System.out.println("El resultat de la suma es: " + resultatOperacioSuma);


        resultatOperacioResta = resta(num1, num2);
        System.out.println("El resultat de la resta es: " + resultatOperacioResta);


        resultatOperacioMulti = multi(num1, num2);
        System.out.println("El resultat de la multipicació es: " + resultatOperacioMulti);


        resultatOperacioDivi = divi(num1, num2);
        System.out.println("El resultat de la divisió es: " + resultatOperacioDivi);

    }
}
