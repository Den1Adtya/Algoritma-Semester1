package Sesi_3;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jumlah jeruk : ");
        int totalJeruk = inputan.nextInt();
        if (totalJeruk == 1) {
            System.out.println( "Beli " +totalJeruk + " = 3000");
        } else if (totalJeruk == 2) {
            System.out.println( "Beli " +totalJeruk + " = 5000");
        } else if (totalJeruk == 5) {
            System.out.println( "Beli " +totalJeruk + " = 10000");
        } else {
            int harga = (totalJeruk / 5) * 10000 + (totalJeruk % 5) * 3000;
            System.out.println( "Beli " +totalJeruk + " = " + harga );
        }
        inputan.close();
    }
}