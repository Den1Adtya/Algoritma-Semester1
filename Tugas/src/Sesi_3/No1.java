package Sesi_3;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = inputan.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        inputan.close();
    }
    }