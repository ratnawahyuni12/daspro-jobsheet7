import java.util.Scanner;
public class TugasTiketBioskop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket = 0, totalTiket = 0;
        double diskon, yangDibayar = 0, totalPenjualan = 0;
        final int hargaTiket = 50000;
        String namaPembeli;

        while (true) {
            System.out.println("===== TIKET BIOSKOP =====");
            System.out.print("Nama Pembeli             : ");
            namaPembeli = sc.nextLine();
            System.out.print("Jumlah tiket yang dibeli : ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            // ketentuan jumlah tiket. apabila 0, maka akan berhenti. jika kurang dari 0 maka tidak valid.
            if (jumlahTiket == 0) {
                System.out.println("Program selesai!");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! coba lagi!\n");
                continue;
            }

            // ketentuan diskon tiket. jika > 4 mendapat diskon 10%. jika > 15 mendapat diskon 15%.
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            // menghitung total pembayaran tiket pembeli.
            yangDibayar = (hargaTiket * jumlahTiket) - (hargaTiket * jumlahTiket * diskon);

            // untuk tambahan di bagian "===== JUMLAH PENJUALAN HARI INI =====".
            totalTiket += jumlahTiket;
            totalPenjualan += yangDibayar;

            System.out.println();

            System.out.println("===== STRUK PEMBELIAN =====");
            System.out.println("Nama pembeli               : " + namaPembeli);
            System.out.println("Jumlah tiket               : " + jumlahTiket);
            System.out.println("Diskon                     : " + (int)(diskon*100) + "%");
            System.out.println("Jumlah pembayaran          : Rp " + (int)yangDibayar);

            System.out.println();

        }
            System.out.println();
            System.out.println("===== JUMLAH PENJUALAN HARI INI =====");
            System.out.println("Jumlah tiket yang terjual     : " + totalTiket);
            System.out.println("Pendapatan penjualan tiket    : Rp " + (int)totalPenjualan);

        sc.close();
    }
}
