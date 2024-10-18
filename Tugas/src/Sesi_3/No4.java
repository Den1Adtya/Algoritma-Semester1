package Sesi_3;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int jumlah;
        int sisa, seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu,duaRibu ,seribu , limaRatus, seratus;
       
        System.out.print("Masukan Jumlah Uang : ");
        jumlah = inputan.nextInt();

        seratusRibu = (int)(jumlah / 100000);
        sisa = (int)(jumlah % 100000);
        limaPuluhRibu = (sisa / 50000);
        sisa = sisa % 50000;
        duaPuluhRibu = (sisa / 20000);
        sisa = sisa % 20000;
        sepuluhRibu = (sisa / 10000);
        sisa = sisa % 10000;
        limaRibu = (sisa / 5000);
        sisa = sisa % 5000;
        duaRibu = (sisa / 2000);
        sisa = sisa % 2000;
        seribu = (sisa / 1000);
        sisa = sisa % 1000;
        limaRatus = (sisa / 500);
        sisa = sisa % 500;
        seratus = (sisa / 100);


        System.out.println("Jumlah Uang = " + jumlah);
        if (seratusRibu > 0) System.out.println(seratusRibu + " lembar 100 Ribuan");
        if (limaPuluhRibu > 0) System.out.println(limaPuluhRibu + " lembar 50 Ribuan");
        if (duaPuluhRibu > 0) System.out.println(duaPuluhRibu + " lembar 20 Ribuan");
        if (sepuluhRibu > 0) System.out.println(sepuluhRibu + " lembar 10 Ribuan");
        if (limaRibu > 0) System.out.println(limaRibu + " lembar 5 Ribuan");
        if (duaRibu > 0) System.out.println(duaRibu + " lembar 2 Ribuan");
        if (seribu > 0) System.out.println(seribu + " lembar 1 Ribuan");
        if (limaRatus > 0) System.out.println(limaRatus + " logam 500");
        if (seratus > 0) System.out.println(seratus + " logam 100");
        // jika menggunakan else if maka sisa dari pembagian sebeleumnya tidak berjalan
        inputan.close();
    }
}