import java.util.Scanner;

public class App {
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

    
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int fahrenheit, celcius ;
        System.out.println("Masukkan suhu dalam Celcius: ");
        celcius = inputan.nextInt();
        fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Suhu dalam Celcius: " + celcius + " C");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " F");
        
        
        
        inputan.close();
    }
}
