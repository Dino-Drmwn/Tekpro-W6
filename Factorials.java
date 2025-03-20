import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";  // Variabel untuk mengontrol loop
        Scanner scan = new Scanner(System.in);

        // Loop untuk meminta input dari pengguna
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            try {
                // Memanggil metode factorial dari MathUtils dan mencetak hasilnya
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap pengecualian dan mencetak pesan kesalahan
                System.out.println(e.getMessage());
            }

            // Meminta pengguna apakah ingin melanjutkan
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }

        // Menutup Scanner
        scan.close();
    }
}