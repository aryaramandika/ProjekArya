import java.util.Scanner;

public class AktivasiKartu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulasi login ke aplikasi perbankan mobile
        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan kata sandi: ");
        String password = scanner.nextLine();

        // Proses otentikasi pengguna
        boolean isAuthenticated = authenticateUser(username, password);

        if (isAuthenticated) {
            // Menu aktivasi kartu
            System.out.print("Masukkan nomor kartu: ");
            String cardNumber = scanner.nextLine();

            System.out.print("Masukkan tanggal kedaluwarsa kartu (MM/YYYY): ");
            String expirationDate = scanner.nextLine();

            System.out.print("Masukkan CVV: ");
            String cvv = scanner.nextLine();

            // Proses aktivasi kartu
            boolean isCardActivationSuccessful = activateCard(cardNumber, expirationDate, cvv);

            if (isCardActivationSuccessful) {
                System.out.println("Kartu dengan nomor " + cardNumber + " berhasil diaktifkan.");
            } else {
                System.out.println("Aktivasi kartu gagal. Mohon coba lagi.");
            }
        } else {
            System.out.println("Autentikasi gagal. Silakan coba lagi.");
        }

        scanner.close();
    }

    // Metode untuk mengotentikasi pengguna
    public static boolean authenticateUser(String username, String password) {
        // Logika otentikasi pengguna
        // ...
        return true; // Ganti dengan logika otentikasi sesuai dengan implementasi yang sebenarnya
    }

    // Metode untuk melakukan aktivasi kartu
    public static boolean activateCard(String cardNumber, String expirationDate, String cvv) {
        // Logika aktivasi kartu
        // ...
        return true; // Ganti dengan logika aktivasi kartu sesuai dengan implementasi yang sebenarnya
    }
}
