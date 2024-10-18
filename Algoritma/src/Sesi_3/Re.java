package Sesi_3;
import java.util.Scanner;

public class Re {
    public static void main1(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        double jumlahTelur, uangDiberikan, uangKembalian,totalBayar,hargaPerKilo ;
        System.out.println("Masukkan jumlah telur yang dibeli (kg): ");
        jumlahTelur = inputan.nextDouble();
        System.out.println("Masukkan uang yang diberikan: ");

        uangDiberikan = inputan.nextDouble();
        hargaPerKilo = 28000;
        totalBayar = jumlahTelur * hargaPerKilo;
        uangKembalian = uangDiberikan - totalBayar;
        
            System.out.println("Jumlah Telur(kg) : " + jumlahTelur + " kilo");
            System.out.println("Total Bayar : " + totalBayar);
            System.out.println("Uang yang diberikan = " + uangDiberikan);
            System.out.println("Uang kembalian : " + uangKembalian);
        
        inputan.close();
    }
}