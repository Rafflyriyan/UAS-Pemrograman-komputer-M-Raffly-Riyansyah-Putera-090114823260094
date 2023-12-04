import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif untuk difaktorisasi: ");
        int bilangan = scanner.nextInt();

        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);
    }

    // Fungsi untuk memfaktorisasi suatu bilangan dan menampilkannya
    private static void faktorisasi(int bilangan) {
        if (bilangan < 2) {
            System.out.println("Bilangan tidak dapat difaktorisasi dengan faktor positif.");
            return;
        }

        int faktor = 2;
        while (bilangan > 1) {
            if (bilangan % faktor == 0) {
                System.out.print(faktor);
                bilangan /= faktor;
                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            } else {
                faktor++;
            }
        }
        System.out.println();
    }
}
