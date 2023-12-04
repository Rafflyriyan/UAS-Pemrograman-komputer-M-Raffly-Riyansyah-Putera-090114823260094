import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n untuk menampilkan deret Fibonacci hingga suku ke-n: ");
        int n = scanner.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Fungsi untuk menghitung nilai Fibonacci dari suku ke-n
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
