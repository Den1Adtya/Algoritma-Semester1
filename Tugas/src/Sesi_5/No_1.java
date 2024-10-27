package Sesi_5;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;
    String status;
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        this.status = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
    }
}

public class No_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        int i=0;
        do {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Nilai: ");
            int nilai = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            daftarMahasiswa[i] = new Mahasiswa(nama, nilai);
            i++;
        } while (i<jumlah);

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("===================================");
        System.out.println("No\t"+"Nama\t"+"Nilai\t"+"Status\t");
        double totalNilai = 0;
        for (i = 0; i<jumlah; i++){
            Mahasiswa mhs = daftarMahasiswa[i];
            System.out.print((i+1)+ "\t");
            System.out.print(mhs.nama + "\t");
            System.out.print(mhs.nilai + "\t");
            System.out.println(mhs.status);
            totalNilai += mhs.nilai;
        }
        double rataRata = (double) totalNilai / jumlah;
        System.out.println("===================================");
      
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);

    
        sc.close();
    }
}