import java.util.Scanner;

public class PemesananKartuBaru {
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
            // Menu pemesanan kartu baru
            System.out.println("Pilih jenis kartu:");
            System.out.println("1. Kartu Debit");
            System.out.println("2. Kartu Kredit");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();

            // Proses pemesanan kartu baru
            boolean isCardOrderSuccessful = orderNewCard(choice);

            if (isCardOrderSuccessful) {
                String cardType = (choice == 1) ? "Kartu Debit" : "Kartu Kredit";
                System.out.println(cardType + " baru berhasil dipesan.");
            } else {
                System.out.println("Pemesanan kartu gagal. Mohon coba lagi.");
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

    // Metode untuk melakukan pemesanan kartu baru
    public static boolean orderNewCard(int choice) {
        // Logika pemesanan kartu baru
        // ...
        return true; // Ganti dengan logika pemesanan kartu sesuai dengan implementasi yang sebenarnya
    }
}
