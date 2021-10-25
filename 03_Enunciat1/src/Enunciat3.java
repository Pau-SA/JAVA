import java.util.Scanner;

public class Enunciat3 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		float importe;
		double litresAl100Km;
		double preu1Km;
        int KmFets;

		System.out.print("Entra l'import de càrrega: ");
		importe = teclat.nextInt();

		System.out.print("Entra els km que has fet: ");
        KmFets = teclat.nextInt();

		System.out.println("Has fet  " + KmFets + " Km.");
		litresAl100Km = (importe / KmFets) * 100;
        
		System.out.println("Cada 100 km el teu cotxe consumeix " + litresAl100Km + " litres.");
		preu1Km = litresAl100Km / 100;

		System.out.println("Un km et costa " + preu1Km);
		teclat.close();
	}

} 