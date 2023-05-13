import java.util.Scanner;

public class SetorTunai{
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
            // Menu setoran tunai
            System.out.print("Masukkan jumlah setoran: ");
            double amount = scanner.nextDouble();

            System.out.print("Masukkan nomor rekening tujuan: ");
            String accountNumber = scanner.next();

            // Proses setoran tunai
            boolean isDepositSuccessful = depositCash(amount, accountNumber);

            if (isDepositSuccessful) {
                System.out.println("Setoran tunai sebesar " + amount + " berhasil dilakukan pada rekening " + accountNumber);
            } else {
                System.out.println("Setoran tunai gagal. Mohon coba lagi.");
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

    // Metode untuk melakukan setoran tunai
    public static boolean depositCash(double amount, String accountNumber) {
        // Logika setoran tunai
        // ...
        return true; // Ganti dengan logika setoran tunai sesuai dengan implementasi yang sebenarnya
    }
}
