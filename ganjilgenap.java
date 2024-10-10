import java.util.Scanner;

public class ganjilgenap {

    public static void main(String[] Args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print(" Masukkan Bilangan :");
        Double bilangan = inputan.nextDouble();
        
        if(bilangan % 2 == 0) {
            System.out.print("Adalah Bilangan Genap :" + bilangan);
        }else {
            System.out.print("Adalah Bilangan Ganjil:" + bilangan);
        }
        inputan.close();
    }
    
}
