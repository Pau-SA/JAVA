
public class Enunciat43 {


static void Matriu(int[][] Matriu){


    for (int i=0; i < Matriu.length; i++){
        for (int j=0; j < Matriu[i].length; j++){
            Matriu[i][j] = j;
            System.out.print(Matriu[i][j]);
            System.out.print("+---");
            System.out.print(i);

            if(Matriu[i][j] == 0){
                System.out.print(" ");
            }else if(Matriu[i][j] < 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


static void PintaLinea(int[][] Matriu){


    for (int i=0; i < Matriu.length; i++){
        for (int j=0; j < Matriu[i].length; j++){
            Matriu[i][j] = j;
            System.out.print(Matriu[i][j]);
            System.out.print("+---");
            System.out.print(i);

            if(Matriu[i][j] == 0){
                System.out.print(" ");
            }else if(Matriu[i][j] < 0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String args[]) throws Exception {
        int [][] nums=new int[3][3];
        Matriu(nums);
    }
}