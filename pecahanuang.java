import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Menghitung Pecahan Uang ");

        System.out.print(" Masukkan Jumlah Uang : ");
        int jumlahUang = scanner.nextInt();

        int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatus, seratus;

        if (jumlahUang >= 100000) {
            seratusRibu = jumlahUang / 100000;
            jumlahUang = jumlahUang % 100000;
            System.out.println(seratusRibu + " Lembar/Keping 100000 Rupiah ");

        }

        if (jumlahUang >= 50000) {
            limaPuluhRibu = jumlahUang / 50000;
            jumlahUang = jumlahUang % 50000;;
            System.out.println(limaPuluhRibu + " Lembar/Keping 50000 Rupiah ");
        }
        if (jumlahUang >= 20000) {
            duaPuluhRibu = jumlahUang / 20000;
            jumlahUang = jumlahUang % 20000;
            System.out.println(duaPuluhRibu + " Lembar/Keping 20000 Rupiah ");
        }
        if (jumlahUang >= 10000) {
            sepuluhRibu = jumlahUang / 10000;
            jumlahUang = jumlahUang % 10000;
            System.out.println(sepuluhRibu + " Lembar/Keping 10000 Rupiah ");
        }
        if (jumlahUang >= 5000) {
            limaRibu = jumlahUang / 5000;
            jumlahUang = jumlahUang % 5000;
            System.out.println(limaRibu + " Lembar/Keping 5000 Rupiah ");
        }
        if (jumlahUang >= 2000) {
            duaRibu = jumlahUang / 2000;
            jumlahUang = jumlahUang % 2000;
            System.out.println(duaRibu + " Lembar/Keping 2000 Rupiah ");
        }
        if (jumlahUang >= 1000) {
            seribu = jumlahUang / 1000;
            jumlahUang = jumlahUang % 1000;
            System.out.println(seribu + " Lembar/Keping 1000 Rupiah ");
        }
        if (jumlahUang >= 500) {
            limaRatus = jumlahUang / 500;
            jumlahUang = jumlahUang % 500;
            System.out.println(limaRatus + " Lembar/Kepingan 500 Rupiah ");
        }
        if (jumlahUang >= 100) {
            seratus = jumlahUang / 100;
            jumlahUang = jumlahUang % 100;
            System.out.println(seratus + " Lembar/Keping 100 Rupiah");
        }

        scanner.close();
    }
    
}
