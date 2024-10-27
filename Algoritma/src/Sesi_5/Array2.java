package Sesi_5;
import java.util.Scanner;


public class Array2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        String mahasiswa[] = new String[100];
        int i=0;
        do {
            System.out.print("Masukkan Nama Mahasiswa: ");
            mahasiswa[i] = sc.nextLine();
            System.out.print("Tambah data mahasiswa lagi? (y/n): ");
            inputLagi = sc.nextLine().toLowerCase();
            i++;
        } while(i < mahasiswa.length && inputLagi.equals("y"));
        System.out.println("Daftar Mahasiswa");

        for (int j = 0; j < mahasiswa.length; j++) {
            if (mahasiswa[j] == null) {
                break;
            }
            System.out.println((j+1) + ". " + mahasiswa[j]);
        }
        sc.close();
    }
}

