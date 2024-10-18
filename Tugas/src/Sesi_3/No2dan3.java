package Sesi_3;
import java.util.Scanner;

public class No2dan3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai anda: ");
        int nilai = inputan.nextInt();
        if (nilai > 75) {
            System.out.print("Selamat Anda Lulus");
        } else {
            System.out.print("Maaf Anda Tidak Lulus");
        }
        if (nilai > 85) {
            System.out.print(" Dengan Predikat A (" +nilai+ ")" );
        } else if (nilai > 75 && nilai < 85) {
            System.out.print(" Dengan Predikat B (" +nilai+ ")");
        } else if (nilai > 65 && nilai < 75) {
            System.out.print(" Dengan Predikat C (" +nilai+ ")");
        } else if (nilai > 55 && nilai < 65) {
            System.out.print(" Dengan Predikat D (" +nilai+ ")");
        } else {
            System.out.print(" Dengan Predikat E (" +nilai+ ")");
        }
        inputan.close();
    }
}