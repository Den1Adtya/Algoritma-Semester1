package Sesi_5;
import java.util.Scanner;

class Mahasiswax {
    String nama;
    Double nilai=0.0;

    public Mahasiswax(String nama, Double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        Mahasiswax mahasiswa[] = new Mahasiswax[100];

        int i=0;
        do {
            System.out.print("Nama Mahasiswa: ");
            String mhs = sc.nextLine();
            System.out.print("Nilai Mahasiswa: ");
            Double nilai = sc.nextDouble();
            sc.nextLine(); // Ini menghabiskan baris baru yang tersisa setelah nextDouble
            mahasiswa[i] = new Mahasiswax(mhs, nilai);
            System.out.print("Tambah data mahasiswa lagi? (y/n): ");
            inputLagi = sc.nextLine().toLowerCase();
            i++;
        } while(i < mahasiswa.length && inputLagi.equals("y"));

        System.out.println("Daftar Mahasiswa");

        for (int j = 0; j < mahasiswa.length; j++) {
            if(mahasiswa[j] == null) break;
            System.out.println((j+1) + ". " + mahasiswa[j].nama + " - " + mahasiswa[j].nilai);
        }
        sc.close();
    }
}