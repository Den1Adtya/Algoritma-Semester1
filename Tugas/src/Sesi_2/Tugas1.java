package Sesi_2;
import java.util.Scanner;

public class Tugas1 {

    // 1.Menghitung uang kembaliam
    public static void hitungKembalian(double jumlahTelur, double uangDiberikan) {
        double hargaPerKilo = 28000;
        double totalBayar = jumlahTelur * hargaPerKilo;
        double uangKembalian = uangDiberikan - totalBayar;
        
            System.out.println("Jumlah Telur(kg) : " + jumlahTelur + " kilo");
            System.out.println("Total Bayar : " + totalBayar);
            System.out.println("Uang yang diberikan = " + uangDiberikan);
            System.out.println("Uang kembalian : " + uangKembalian);
        
    }

    // 2. Mengubah suhu Celcius ke Fahrenheit
    public static void celsiusKeFahrenheit(int celsius) {
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Suhu dalam Celcius: " + celsius + " C");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " F");
    }

    // 3. Menghitung keliling lingkaran
    public static void kelilingLingkaran(int jariJari) {
        int keliling = (int) (2 * Math.PI * jariJari); 
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    // 4. Menghitung luas persegi panjang
    public static void luasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    // 5. Menghitung volume kubus
    public static void volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);
    }

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        // 1. Menghitung uang kembalian
        System.out.println("Masukkan jumlah telur yang dibeli (kg): ");
        double jumlahTelur = inputan.nextDouble();
        System.out.println("Masukkan uang yang diberikan: ");
        double uangDiberikan = inputan.nextDouble();
        hitungKembalian(jumlahTelur, uangDiberikan);

        // 2. Mengonversi Suhu Celcius ke Fahrenheit
        System.out.println("\nMasukkan suhu dalam Celcius: ");
        int celsius = inputan.nextInt();
        celsiusKeFahrenheit(celsius);

        // 3. Menghitung Keliling Lingkaran
        System.out.println("\nMasukkan jari-jari lingkaran: ");
        int jariJari = inputan.nextInt();
        kelilingLingkaran(jariJari);

        // 4. Menghitung Luas Persegi Panjang
        System.out.println("\nMasukkan panjang persegi panjang: ");
        int panjang = inputan.nextInt();
        System.out.println("Masukkan lebar persegi panjang: ");
        int lebar = inputan.nextInt();
        luasPersegiPanjang(panjang, lebar);

        // 5. Menghitung Volume Kubus
        System.out.println("\nMasukkan sisi kubus: ");
        int sisi = inputan.nextInt();
        volumeKubus(sisi);

        inputan.close();
    }
}
