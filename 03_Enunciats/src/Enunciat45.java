import java.util.Scanner;

public class Enunciat45 {

    static Scanner teclat = new Scanner(System.in);

    // PER COMPROBAR ELS NUMEROS
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

    // PER FER LA SUMA
    static int suma(int numero1, int numero2) {
        int operaciosuma = 0;

        operaciosuma = numero1 + numero2;

        return operaciosuma;
    }

    // PER FER LA RESTA
    static int resta(int numero1, int numero2) {
        int operacioresta = 0;

        operacioresta = numero1 - numero2;

        return operacioresta;
    }

    // PER FER LA MULTIPLICACIO
    static int multi(int numero1, int numero2) {
        int operaciomulti = 0;

        operaciomulti = numero1 * numero2;

        return operaciomulti;
    }

    // PER FER LA DIVISIO
    static float divi(int numero1, int numero2) {
        float operaciodivi = 0;

        boolean noDivisio = false;

        if ((numero1 == 0) || (numero2 == 0)) {
            noDivisio = false;
            System.out.println("No es pot fer!! Has posat un 0!!");
        }else{
            noDivisio = true;
            System.out.println("Torna a escollir numeros!");
            
        }

        operaciodivi = numero1 / numero2;
        return operaciodivi;
    }


    static int potencia(int numero1, int numero2) {
        int numPotencia = 1;
        if (numero1 > 0 && numero2 == 0) {
            return numPotencia;
        } else if (numero1 == 0 && numero2 >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= numero2; i++) {
                numPotencia = numPotencia * numero1;
            }
            return numPotencia;
        }
    }

    public static void main(String[] args) {

        int resultatOperacioSuma;
        int resultatOperacioResta;
        int resultatOperacioMulti;
        float resultatOperacioDivi;
        float resultatOperacioPotencia = 0;

        int opcio = 0;

        System.out.println("Per fer la suma escriu 1");
        System.out.println("Per fer la resta escriu 2");
        System.out.println("Per fer la multi escriu 3");
        System.out.println("Per fer la divi escriu 4");
        System.out.println("Per fer la potencia escriu 5");

        System.out.print("Escriu: ");
        opcio = teclat.nextInt();

        int num1 = demanaNombre("Entra el numero 1: ");
        int num2 = demanaNombre("Entra el numero 2: ");
        System.out.println("Has entrat el número " + num1 + " i el " + num2);

        // PER MOSTRAR EL RESULTAT DE LES FUNCIONS ANTERIORS
        if (opcio == 1) {
            resultatOperacioSuma = suma(num1, num2);
            System.out.println("El resultat de la suma es: " + resultatOperacioSuma);
        } else if (opcio == 2) {
            resultatOperacioResta = resta(num1, num2);
            System.out.println("El resultat de la resta es: " + resultatOperacioResta);
        } else if (opcio == 3) {
            resultatOperacioMulti = multi(num1, num2);
            System.out.println("El resultat de la multipicació es: " + resultatOperacioMulti);
        } else if (opcio == 4) {
            resultatOperacioDivi = divi(num1, num2);
            System.out.println("El resultat de la divisió es: " + resultatOperacioDivi);
        } else if (opcio == 5) {
            resultatOperacioPotencia = potencia(num1, num2);
            System.out.println("El resultat de la divisió es: " + resultatOperacioPotencia);
        }

    }
}
