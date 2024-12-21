package Sesi_12;
// Cari Nilai Maksimum Array
public class No_4 {
        public static int findMax(int[] arr, int n) {
            if (n == 1) {
                return arr[0];
            } else {
                int max = findMax(arr, n - 1);
                return (arr[n - 1] > max) ? arr[n - 1] : max;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 7, 5};
            int n = arr.length;
            System.out.println("Nilai maksimum: " + findMax(arr, n));
        }
    }  

