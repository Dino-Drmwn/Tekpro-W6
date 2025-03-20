import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];  // Membuat array untuk menyimpan frekuensi huruf A-Z (indeks 0-25)
        Scanner scan = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input

        // Meminta pengguna memasukkan kata
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();  // Membaca input dari pengguna

        // Mengonversi kata ke huruf besar untuk memastikan konsistensi
        word = word.toUpperCase();

        // Menghitung frekuensi kemunculan setiap huruf
        for (int i = 0; i < word.length(); i++) {  // Loop melalui setiap karakter dalam kata
            try {
                // Mengonversi karakter ke indeks array (A=0, B=1, ..., Z=25)
                counts[word.charAt(i) - 'A']++;  // Menambah frekuensi huruf yang sesuai
            } catch (ArrayIndexOutOfBoundsException e) {
                // Jika karakter bukan huruf, tangkap pengecualian dan cetak pesan
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Mencetak frekuensi kemunculan setiap huruf
        System.out.println();  // Mencetak baris kosong untuk pemisah
        for (int i = 0; i < counts.length; i++) {  // Loop melalui array frekuensi
            if (counts[i] != 0) {  // Jika huruf muncul setidaknya sekali
                // Mengonversi indeks kembali ke huruf dan mencetak frekuensi
                System.out.println((char)(i + 'A') + ": " + counts[i]);
            }
        }
    }
}