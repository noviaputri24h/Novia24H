import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
        Double nilaiUjian;
        Scanner inputan = new Scanner (System.in);

        nilaiUjian = 75.0;
        System.out.print(" Masukkan Nilai :");
        nilaiUjian = inputan.nextDouble();

        if (nilaiUjian > 75) {
            System.out.print(" Lulus ");
        }else {
            System.out.print(" Tidak Lulus ");
        }
        inputan.close();
    }
    
}
