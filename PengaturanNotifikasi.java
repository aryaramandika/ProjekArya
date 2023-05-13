import java.util.Scanner;

public class PengaturanNotifikasi{
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
            // Menu pengaturan notifikasi
            System.out.println("Pilih opsi notifikasi:");
            System.out.println("1. Aktifkan notifikasi SMS");
            System.out.println("2. Aktifkan notifikasi push");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();

            // Proses pengaturan notifikasi
            boolean isNotificationSettingSuccessful = setNotificationPreference(choice);

            if (isNotificationSettingSuccessful) {
                String notificationType = (choice == 1) ? "SMS" : "Push";
                System.out.println("Notifikasi " + notificationType + " berhasil diaktifkan.");
            } else {
                System.out.println("Pengaturan notifikasi gagal. Mohon coba lagi.");
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

    // Metode untuk melakukan pengaturan notifikasi
    public static boolean setNotificationPreference(int choice) {
        // Logika pengaturan notifikasi
        // ...
        return true; // Ganti dengan logika pengaturan notifikasi sesuai dengan implementasi yang sebenarnya
    }
}
