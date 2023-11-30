import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah saldo awal : ");
        double saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun) :");
        int tahun = sc.nextInt();

        double hasil = hitungLaba(saldoAwal, tahun);
        System.out.println("Saldo akhir setelah " + tahun + " tahun adalah " + hasil);

        System.out.print("Jumlah saldo setela " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1);
        }
    }
}
