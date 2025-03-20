import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scan.nextLine(); // Baca seluruh baris input

        Scanner scanLine = new Scanner(line); // Scanner baru untuk membaca token satu per satu

        while (scanLine.hasNext()) {
            String token = scanLine.next(); // Ambil token berikutnya
            try {
                val = Integer.parseInt(token); // Coba konversi ke integer
                sum += val;
            } catch (NumberFormatException e) {
                // Tangani kesalahan jika token bukan angka
                System.out.println("Skipping non-integer: " + token);
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
