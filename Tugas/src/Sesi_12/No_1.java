package Sesi_12;
// Cetak Angka Mundur
public class No_1 {
    public static void reverse(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) System.out.print(",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverse(7); 
    }

}
