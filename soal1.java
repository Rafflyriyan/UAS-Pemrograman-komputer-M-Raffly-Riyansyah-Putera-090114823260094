import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = scanner.nextInt();

        double totalHarga = hitungTotalHarga(hargaBarang, jumlahPembelian);

        System.out.println("Total harga setelah diskon: " + totalHarga);
    }

    // Fungsi untuk menghitung total harga dengan memperhitungkan diskon
    private static double hitungTotalHarga(double hargaBarang, int jumlahPembelian) {
        double totalHarga = hargaBarang * jumlahPembelian;

        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            // Diskon 5% untuk pembelian 5 hingga 10 barang
            totalHarga *= 0.95;
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            // Diskon 10% untuk pembelian 11 hingga 20 barang
            totalHarga *= 0.9;
        } else if (jumlahPembelian > 20) {
            // Diskon 20% untuk pembelian lebih dari 20 barang
            totalHarga *= 0.8;
        }

        return totalHarga;
    }
}
