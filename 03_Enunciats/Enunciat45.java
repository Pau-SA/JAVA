import java.util.Scanner;

public class Enunciat45 {

    static Scanner teclat = new Scanner(System.in);

    String opcions[] = new String[]{"suma", "resta", "multiplicacio", "divisio", "potencia"};

    // PER COMPROBAR ELS NUMEROS
    static float demanaNombre(String frase) {
        float numeroLlegit = 0;
        boolean nombreIncorrecte = false;
        do {
            try {
                nombreIncorrecte = false;
                System.out.print(frase);
                numeroLlegit = teclat.nextFloat();
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
    static float suma(float numero1, float numero2) {
        float operaciosuma = 0;

        operaciosuma = numero1 + numero2;

        return operaciosuma;
    }

    // PER FER LA RESTA
    static float resta(float numero1, float numero2) {
        float operacioresta = 0;

        operacioresta = numero1 - numero2;

        return operacioresta;
    }

    // PER FER LA MULTIPLICACIO
    static float multi(float numero1, float numero2) {
        float operaciomulti = 0;

        operaciomulti = numero1 * numero2;

        return operaciomulti;
    }

    // PER FER LA DIVISIO
    static float divi(float numero1, float numero2) {
        float operaciodivi = 0;

        operaciodivi = numero1 / numero2;
        
        return operaciodivi;
    }

    // PER FER LA POTÈNCIA
    static float potencia(float numero1, float numero2) {
        float numPotencia = 1;
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
         boolean segonEs0 = false;

        int opcio = 0;

        System.out.println("Per fer la suma escriu 1");
        System.out.println("Per fer la resta escriu 2");
        System.out.println("Per fer la multi escriu 3");
        System.out.println("Per fer la divi escriu 4");
        System.out.println("Per fer la potencia escriu 5");

        System.out.print("Escriu: ");
        opcio = teclat.nextInt();

        float num1 = demanaNombre("Entra el numero 1: ");
        float num2 = demanaNombre("Entra el numero 2: ");
        System.out.println("Has entrat el número " + num1 + " i el " + num2);

        // PER MOSTRAR EL RESULTAT DE LES FUNCIONS ANTERIORS
        if (opcio == 1) {
            System.out.println("El resultat de la suma es: " + suma(num1, num2));
        } else if (opcio == 2) {
            System.out.println("El resultat de la resta es: " + resta(num1, num2));
        } else if (opcio == 3) {
            System.out.println("El resultat de la multipicació es: " +  multi(num1, num2));
        } else if (opcio == 4) {

            do {
                if (num2 == 0) {
                    System.out.println("ERROR, Torna-hi");
                    segonEs0 = true;
                    num2 = demanaNombre("Entra el numero 2: ");
                } else {
                    segonEs0 = false;                    
                }
            } while (segonEs0 == true);

            System.out.println("El resultat de la divisió es: " + divi(num1, num2));

        } else if (opcio == 5) {
            System.out.println("El resultat de la divisió es: " + potencia(num1, num2));
        }

        //AFEGIT//
        int numero1, numero2;
            numero1 = 1;
            numero2 = 2;
        System.out.println("Extra " + suma(numero1, numero2));
    }
}
