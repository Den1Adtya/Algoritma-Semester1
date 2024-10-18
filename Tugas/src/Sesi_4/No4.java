package Sesi_4;

public class No4 {
    public static void main(String[] args) {
        for (int i=1 ; i<=3; i++){
            for (int j=1; j<=6; j++){
                if((j%2==1) ^ (i==2)){
                    System.out.print("S");
                }else {
                    System.out.print("O");
                }
            }
            System.err.println();
        } 
    }
}
