package Sesi_7;
import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    double nilai;
    String hurufMutu;
    double bobot;

    public MataKuliah(String nama, int sks, double nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
        hitungHurufMutu(); // Panggil metode ini saat objek dibuat
    }
    
    private void hitungHurufMutu() {
        if (nilai >= 85) {
            hurufMutu = "A";
            bobot = 4.0;
        } else if (nilai >= 80) {
            hurufMutu = "A-";
            bobot = 3.7;
        } else if (nilai >= 75) {
            hurufMutu = "B+";
            bobot = 3.3;
        } else if (nilai >= 70) {
            hurufMutu = "B";
            bobot = 3.0;
        } else if (nilai >= 65) {
            hurufMutu = "B-";
            bobot = 2.7;
        } else if (nilai >= 60) {
            hurufMutu = "C+";
            bobot = 2.3;
        } else if (nilai >= 55) {
            hurufMutu = "C";
            bobot = 2.0;
        } else if (nilai >= 40) {
            hurufMutu = "D";
            bobot = 1.0;
        } else {
            hurufMutu = "E";
            bobot = 0.0;
        }
    }
}

public class No_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt(); 
        scanner.nextLine();

        while (true) {
            System.out.print("\nMasukkan nama mata kuliah (atau 'selesai' untuk mengakhiri): ");
            String namaMataKuliah = scanner.nextLine();
            if (namaMataKuliah.equalsIgnoreCase("selesai")) break;
            
            System.out.print("Masukkan jumlah SKS untuk " + namaMataKuliah + ": ");
            int sks = scanner.nextInt();
            System.out.print("Masukkan nilai untuk " + namaMataKuliah + ": ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();
            
            mataKuliahList.add(new MataKuliah(namaMataKuliah, sks, nilai));
        }

        System.out.println("\nDAFTAR NILAI " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-5s | %-11s | %-10s | %-10s |%n", 
                         "No", "Mata Kuliah", "SKS", "Huruf Mutu", "Bobot", "Nilai");
        System.out.println("----------------------------------------------------------------------------------------");
        
        double totalBobot = 0;
        int totalSKS = 0;
        int nomor = 1;
       
        for (MataKuliah mk : mataKuliahList) {
            System.out.printf("| %-3d | %-30s | %-5d |%-11s  | %-10.2f | %-10.2f |%n", 
                            nomor++, mk.nama, mk.sks, mk.hurufMutu, mk.bobot, mk.nilai);
            totalBobot += (mk.bobot * mk.sks);
            totalSKS += mk.sks;
        }
        
        System.out.println("----------------------------------------------------------------------------------------");
        double ipk = totalBobot / totalSKS;
        int nextSks = totalSKS + 1;
        System.out.printf("Jumlah SKS: %-5d%n", totalSKS);
        System.out.printf("IP Semester: %.2f%n", ipk);
        System.out.printf("SkS Maksimal Yang Bisa Diambil Semester Depan:  %d%n", nextSks);
        scanner.close();
    }
    
}