package Sesi_12;
// Periksa Palindrom
import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrom(input)) {
            System.out.println("'"+input + "' adalah palindrom.");
        } else {
            System.out.println("'"+input + "' bukan palindrom.");
        }
    }

    public static boolean isPalindrom(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); 
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
