import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
                System.exit(0);
        }

        System.out.println("Hasil: " + hasil);
    }

    // Metode untuk penjumlahan
    private static double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    private static double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    private static double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    private static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            System.exit(0);
            return 0; // Hanya agar kompilator tidak mengeluh tentang return
        }
    }
}
