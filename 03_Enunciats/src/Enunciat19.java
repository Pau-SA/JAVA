import java.util.Scanner;

public class Enunciat19 {
    public static void main(String args[]) throws Exception {
    Scanner teclat = new Scanner(System.in);

    int dia, mes, any;
   // (|| = O     && = I)
    System.out.println("Entra el dia: ");
    dia = teclat.nextInt();

    System.out.println("Entra el mes: ");
    mes = teclat.nextInt();
    
    System.out.println("Entra el any: ");
    any = teclat.nextInt();

        if (any == 0){
            System.out.println("Data incorrecta!");

        }else{
            if (mes == 2 && (dia >= 1 && dia < 28)){ //pel febrer
                System.out.println("Data correcta!");

            }else{ //ara fem els que acaben en 31
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7  || mes == 8 || mes == 10|| mes == 12 || mes == 6) {
                    System.out.println("data correcta");

                }else{
                    System.out.println("té 30 dies");
                }

            }

            
        }





teclat.close();


    }
}
