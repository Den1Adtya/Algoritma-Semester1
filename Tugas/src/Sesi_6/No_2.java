package Sesi_6;
import java.util.Stack;
import java.util.Scanner;

public class No_2 {
    static class Buah {
        String nama;
        int harga;
        
        Buah(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }
    }
    
    static class ItemBelanja {
        String nama;
        int jumlah;
        int harga;
        
        ItemBelanja(String nama, int jumlah, int harga) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
        }
    }
    
    static Stack<Buah> daftarBuah = new Stack<>();
    static Stack<ItemBelanja> keranjangBelanja = new Stack<>();
    static int totalbelanja = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        daftarBuah.push(new Buah("semangka", 20000));
        daftarBuah.push(new Buah("duku", 15000));
        daftarBuah.push(new Buah("mangga", 25000));
        daftarBuah.push(new Buah("jeruk", 30000));
        daftarBuah.push(new Buah("apel", 9500));

        int pilihan = 1;
        String inputlagi = "y";
        do {
            System.out.println("Menu: ");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            if (pilihan == 3) {
                System.out.println("Anda telah keluar dari program");
                break;
            }
            
            switch (pilihan) {
                case 1:
                    System.out.println("Buah yang tersedia: ");
                    for (int i = 0; i < daftarBuah.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarBuah.get(i).nama);
                    }

                    System.out.print("Buah yang ingin anda beli: ");
                    int buahdipilih = sc.nextInt();
                    sc.nextLine();
                    
                    if (buahdipilih >= 1 && buahdipilih <= 5) {
                        System.out.print("Masukan jumlah: ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        Buah pilihBuah = daftarBuah.get(buahdipilih - 1);
                        int subtotal = jumlah * pilihBuah.harga;
                        keranjangBelanja.push(new ItemBelanja(pilihBuah.nama, jumlah, pilihBuah.harga));
                        totalbelanja += subtotal;

                        System.out.println("Buah telah ditambahkan kedalam keranjang");
                    } else {
                        System.out.println("Masukan berupa angka yang tersedia");
                    }
                    break;
                    
                case 2:
                    if (keranjangBelanja.isEmpty()) {
                        System.out.println("Anda belum membeli apapun");
                        return;
                    }
                    
                    System.out.println("Daftar belanja:");
                    System.out.println("-".repeat(30));
                    System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");

                    for (int i = keranjangBelanja.size() - 1; i >= 0; i--) {
                        ItemBelanja item = keranjangBelanja.get(i);
                        int subtotal = item.jumlah * item.harga;
                        System.out.println((keranjangBelanja.size() - i) + "\t" + item.nama + "\t\t" + 
                                           item.jumlah + "\t" + item.harga + "\t" + subtotal);
                    }

                    System.out.println("-".repeat(30));
                    System.out.println("Total: " + totalbelanja);
                    double diskon = totalbelanja * 0.15;
                    System.out.println("Discount(15%): " + diskon);
                    double totalbayar = totalbelanja - diskon;
                    System.out.println("Total bayar: " + totalbayar);
                    break;
                    
                default:
                    System.out.println("Masukan pilihan yang tersedia");
                    break;
            }
        } while (inputlagi.equals("y"));
        
        sc.close();
    }
}