    public class MathUtils {
        // Metode untuk menghitung faktorial
        public static int factorial(int n) {
            // Memeriksa apakah input negatif
            if (n < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
            // Memeriksa apakah input terlalu besar (lebih dari 16)
            if (n > 16) {
                throw new IllegalArgumentException("Factorial is too large for this program.");
            }

            // Menghitung faktorial
            int fac = 1;
            for (int i = n; i > 0; i--) {
                fac *= i;
            }
            return fac;
        }
    }