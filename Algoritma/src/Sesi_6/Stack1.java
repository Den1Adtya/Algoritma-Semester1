package Sesi_6;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Inisialisasi Stack untuk menyimpan nama-nama di baris 1, kelompok 1
        Stack<String> kelompok_1_1 = new Stack<>();

        // Menambahkan nama-nama ke Stack
        kelompok_1_1.push("deni");
        kelompok_1_1.push("ilham");
        kelompok_1_1.push("ade");
        kelompok_1_1.push("fahrul");
        kelompok_1_1.push("nanda");

        // Menampilkan anggota kelompok 1_1
        System.out.println("Anggota Kelompok 1_1 di Baris 1:");
        System.out.println(kelompok_1_1);

        // Peek (lihat elemen paling atas tanpa menghapusnya)
        System.out.println("\nElemen paling atas (peek): " + kelompok_1_1.peek());

        // empty mengecek
        System.out.println("Apakah Stack kosong? " + kelompok_1_1.empty());

        // Mendapatkan elemen pertama
        System.out.println("Elemen pertama: " + kelompok_1_1.firstElement());

        // Mendapatkan elemen terakhir
        System.out.println("Elemen terakhir: " + kelompok_1_1.lastElement());

        // Menambahkan elemen baru
        System.out.println("\nMenambahkan mato ke Kelompok 1_1.");
        kelompok_1_1.push("mato");
        System.out.println("Setelah penambahan: " + kelompok_1_1);

        // Menghapus elemen terakhir
        System.out.println("\nMenghapus nama terakhir dari Kelompok 1_1: " + kelompok_1_1.pop());
        System.out.println("Setelah penghapusan: " + kelompok_1_1);

        // Menghapus elemen tertentu (misal, menghapus "ade")
        kelompok_1_1.remove("ade");
        System.out.println("\nSetelah menghapus 'ade': " + kelompok_1_1);

        // get Mendapatkan elemen berdasarkan indeks 
        System.out.println("Elemen di indeks 2: " + kelompok_1_1.get(2));

        // clear
        kelompok_1_1.clear();
        System.out.println("\nSetelah clear : " + kelompok_1_1);
        System.out.println("Apakah Stack kosong? " + kelompok_1_1.empty());
    }
}