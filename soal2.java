import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
       // Menentukan nilai username dan password yang valid
       String usernameValid = "Raffly28";
       String passwordValid = "281000";

       // Meminta pengguna memasukkan username dan password
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan username: ");
       String username = scanner.nextLine();
       System.out.print("Masukkan password: ");
       String password = scanner.nextLine();

       // Melakukan autentikasi
       if (autentikasi(username, password, usernameValid, passwordValid)) {
           System.out.println("Autentikasi Berhasil");
       } else {
           System.out.println("Autentikasi Gagal");
       }
   }

   // Fungsi untuk melakukan autentikasi
   private static boolean autentikasi(String inputUsername, String inputPassword, String validUsername, String validPassword) {
       // Memeriksa apakah username dan password sesuai
       return inputUsername.equals(validUsername) && inputPassword.equals(validPassword);  
    }
}
