package Sesi_6;
import java.util.Scanner;
import java.util.Stack;

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

        Stack<Mahasiswa> stackMahasiswa = new Stack<>();

        int i = 0;
        do {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Nilai: ");
            int nilai = sc.nextInt();
            sc.nextLine(); 

            stackMahasiswa.push(new Mahasiswa(nama, nilai));
            i++;
        } while (i < jumlah);

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("===================================");
        System.out.println("No\t"+"Nama\t"+"Nilai\t"+"Status\t");
        
        double totalNilai = 0;
        int nomer = 1;
        
        while (!stackMahasiswa.isEmpty()) {
            Mahasiswa mhs = stackMahasiswa.pop();
            System.out.print(nomer + "\t");
            System.out.print(mhs.nama + "\t");
            System.out.print(mhs.nilai + "\t");
            System.out.println(mhs.status);
            
            totalNilai += mhs.nilai;
            nomer++;
        }

        double rataRata = totalNilai / jumlah;
        System.out.println("===================================");
      
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);

        sc.close();
    }
}