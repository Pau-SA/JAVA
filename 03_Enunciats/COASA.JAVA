public class COASA {
    public static void main(String[] args){
     
        char mayus=65;
        char mins=97;
        char[] arrMinuscules = new char[26];
        char[] arrMajuscules = new char[26];


        //Entro las dades de "A" a la "Z" i de "a" a la "z"
        for (int i = 0; i < arrMajuscules.length; i++) {
            arrMajuscules[i]=mayus;
            mayus++;
            arrMinuscules[i]=mins;
            mins++;
        }


        //Mostro les dades de la array arrMajuscules
        for (int i = 0; i < arrMajuscules.length; i++) {
            System.out.print(arrMajuscules[i]);
            System.out.print(" ");
        }


        System.out.println(" ");

        
        //Mostro les dades de la array arrMinuscules
        for (int i = 0; i < arrMinuscules.length; i++) {
            System.out.print(arrMinuscules[i]);
            System.out.print(" ");
        }
    }


    
}