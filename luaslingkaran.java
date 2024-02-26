import java.util.Scanner;

public class luaslingkaran {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double luas;

        System.out.print("Masukkan jari-jari : ");
        double r= input.nextDouble();

        luas = phi * r * r;

        System.out.println("Hasil luas lingkarannya adalah = " + luas);

    }
}
