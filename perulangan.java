public class perulangan {
    public static void main(String[] args) {
        int baris =  4;

        for(int i = 1; i<=baris; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
