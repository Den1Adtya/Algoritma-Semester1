package Sesi_7;


    import java.util.Scanner;


    public class No_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        double gajiBulanan = scanner.nextDouble();
        
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        int upahLemburPerJam = (int) Math.ceil(gajiBulanan / 173);

        int totalLembur;
        int lemburNormal, lemburDouble;
        
        if (jamLembur <= 4) {
            lemburNormal = jamLembur * upahLemburPerJam;
            lemburDouble = 0;
        } else {
            lemburNormal = 4 * upahLemburPerJam;
            lemburDouble = (jamLembur - 4) * 2 * upahLemburPerJam;
        }
        totalLembur = lemburNormal + lemburDouble;

        double gajiTotal = gajiBulanan + totalLembur;

        System.out.println("\nGaji Bulanan: " + gajiBulanan);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah lembur per jam: " + upahLemburPerJam);
        System.out.println("Maka gaji yang diberikan adalah:");
        System.out.println(gajiBulanan + " + ( 4 * " + upahLemburPerJam + " ) + ( 4 * 2 * " + upahLemburPerJam+")");
        System.out.println(gajiBulanan + " + " + lemburNormal + " + " + lemburDouble );
        System.out.println("Gaji total setelah lembur: " + gajiTotal);

        scanner.close();
    }
}

