package Sesi_12;
// Mencari Elemen Array
public class No_3 {
    
    public static boolean contains(int[] arr, int n, int target) {
        if (n == arr.length) {
            return false;
        } else if (arr[n] == target) {
            return true;
        }
        return contains(arr, n + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 12;
        boolean result = contains(arr, 0, target);
        System.out.println("Target ada di dalam array: " + result);
    }
    }
