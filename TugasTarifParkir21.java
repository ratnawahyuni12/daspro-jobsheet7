import java.util.Scanner;
public class TugasTarifParkir21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        final int tarifMobil = 3000, tarifMotor = 2000, tarifMaks = 12500;

        while (true) {
            System.out.println("===== TARIF PARKIR =====");
            System.out.println("Kode kendaraan: 1 = mobil, 2 = motor, 0 = selesai");
            System.out.println();

            System.out.print("Jenis Kendaraan : ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! coba lagi!");
                continue;
            }

            System.out.print("Durasi parkir   : ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total = tarifMaks;
            } else if (jenis == 1) {
                total = tarifMobil * durasi;
            } else if (jenis == 2) {
                total = tarifMotor * durasi;
            } else {
                System.out.println("Jenis kendaraan tidak dikenali!");
                continue;
            }

            System.out.println();

            System.out.println("Tarif parkir yang dibayarkan adalah Rp " + total);
            System.out.println();
        }
        System.out.println("Transaksi selesai!");
        sc.close();
    }
}
