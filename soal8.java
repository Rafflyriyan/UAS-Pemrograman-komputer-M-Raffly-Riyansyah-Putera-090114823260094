public class soal8 {
    private String username;
    private String password;
    private boolean isActive;

    // Konstruktor untuk inisialisasi akun
    public soal8(String username, String password, boolean isActive) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    // Metode untuk menampilkan informasi akun
    public void displayAccountInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status Aktif: " + (isActive ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void activateAccount() {
        isActive = true;
        System.out.println("Akun diaktifkan.");
    }

    // Metode untuk menonaktifkan akun
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun dinonaktifkan.");
    }
    public static void main(String[] args) {
         // Contoh penggunaan kelas UserAccount
         soal8 user1 = new soal8("raffly_ryn", "2810000", true);

         // Menampilkan informasi awal
         System.out.println("Informasi Awal Akun:");
         user1.displayAccountInfo();
 
         // Menonaktifkan akun
         user1.deactivateAccount();
 
         // Menampilkan informasi setelah menonaktifkan akun
         System.out.println("\nInformasi Akun Setelah Dinonaktifkan:");
         user1.displayAccountInfo();
    }
}
