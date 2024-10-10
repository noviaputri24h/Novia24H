import java.util.Scanner;

public class konversinila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Konversi Nilai Menjadi Grade ");

        double persenAbsen = 10.0/100;
        double persenTugas = 20.0/100;
        double persenProject = 25.0/100;
        double persenQuiz = 5.0/100;
        double persenUts = 20.0/100;
        double persenUas = 20.0/100;

        System.out.print( " Masukkan Nama Mahasiswa : ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print(" Masukkan Nilai Absen : ");
        double nilaiAbsen = scanner.nextDouble();

        System.out.println(" Masukkan Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();

        System.out.println(" Masukkan Nilai Project : ");
        double nilaiProject = scanner.nextDouble();

        System.out.println(" Masukkan Nilai Quiz : ");
        double nilaiQuiz = scanner.nextDouble();

        System.out.print(" Masukkan Nilai Uts : ");
        double nilaiUts = scanner.nextDouble();

        System.out.print(" Masukkan Nilai Uas : ");
        double nilaiUas = scanner.nextDouble();

        double nilaiAkhir = (nilaiAbsen * persenAbsen) +
                           (nilaiTugas * persenTugas) +
                           (nilaiProject * persenProject) +
                           (nilaiQuiz * persenQuiz) +
                           (nilaiUts * persenUts) +
                           (nilaiUas * persenUas);
        String grade;
        String keterangan;

        if (nilaiAkhir >= 85) {
            grade = "A";
        }else if (nilaiAkhir >= 75) {
            grade = "B";
        }else if (nilaiAkhir >= 65) {
            grade = "C";
        }else if (nilaiAkhir >= 55) {
            grade = "D";
        }else {
            grade = "E";

        }

        if (nilaiAkhir >= 85) {
            keterangan = "Lulus";
        }else if (nilaiAkhir >= 75) {
            keterangan = "Lulus";
        }else if (nilaiAkhir >= 65) {
            keterangan = "Remedial";
        }else if (nilaiAkhir >= 55) {
            keterangan = "Tidak Lulus";
        }else {
            keterangan = "Tidak Lulus";

        }

        System.out.println(" Kesimpulan ");

        System.out.println(" Nama Mahasiswa : " + namaMahasiswa);
        System.out.println(" Nilai Akhir Mahasiswa : " + (int)nilaiAkhir);
        System.out.println(" Grade Mahasiswa : " + grade);
        System.out.println(" Keterangan : " + keterangan);

        scanner.close();

    }
    
}
