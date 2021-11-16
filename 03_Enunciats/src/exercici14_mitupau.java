import java.util.Scanner;

public class exercici14_mitupau {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int valorentrat, stocbitllets;
        int bitllets;
        int contador500 = 0, contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0 ;
        int[] arrayinventari = { 500, 200, 100, 50, 20, 10, 5 };
        int[] arraycanvi = new int[7];


        //Introduir import canvi
        do {
            System.out.print("Entra la quantitat d'euros que sigui múltiple de 5: ");
            valorentrat = teclat.nextInt();

            if (valorentrat % 5 != 0) {
                System.out.println("ERROR");
            }

        } while (valorentrat % 5 != 0);


      //Introduir stoc bitllets
      System.out.println("Entra els bitllets de 500");
      stocbitllets = teclat.nextInt();  
      arrayinventari[0] = stocbitllets;
      System.out.println("Entra els bitllets de 200");
      stocbitllets = teclat.nextInt();  
      arrayinventari[1] = stocbitllets;
      System.out.println("Entra els bitllets de 100");
      stocbitllets = teclat.nextInt();  
      arrayinventari[2] = stocbitllets;
      System.out.println("Entra els bitllets de 50");
      stocbitllets = teclat.nextInt();  
      arrayinventari[3] = stocbitllets;
      System.out.println("Entra els bitllets de 20");
      stocbitllets = teclat.nextInt();  
      arrayinventari[4] = stocbitllets;
      System.out.println("Entra els bitllets de 10");
      stocbitllets = teclat.nextInt();  
      arrayinventari[5] = stocbitllets;
      System.out.println("Entra els bitllets de 5");
      stocbitllets = teclat.nextInt();  
      arrayinventari[6] = stocbitllets;


      
    do{

        if (valorentrat >= 500){
            contador500++;
            valorentrat=valorentrat-500;
        }else if(valorentrat >= 200){
            contador200++;
            valorentrat=valorentrat-200;
        }else if(valorentrat >= 100){
            contador100++;
            valorentrat=valorentrat-100;
        }else if(valorentrat >= 50){
            contador50++;
            valorentrat=valorentrat-50;
        }else if(valorentrat >= 20){
            contador20++;
            valorentrat=valorentrat-20;
        }else if(valorentrat >= 10){
            contador10++;
            valorentrat=valorentrat-10;
        }else if(valorentrat >= 5){
            contador5++;
            valorentrat=valorentrat-5;
        }

    }while(valorentrat !=0);
 


    System.out.println("Tindràs " + contador500 +  " de 500");
    System.out.println("Tindràs " + contador200 + " de 200");
    System.out.println("Tindràs " + contador100 + "  de 100");
    System.out.println("Tindràs " + contador50 + " de 50");
    System.out.println("Tindràs " + contador20  + " de 20");
    System.out.println("Tindràs " + contador10 + " de 10");
    System.out.println("Tindràs " + contador5 + " de 5");

    }
}