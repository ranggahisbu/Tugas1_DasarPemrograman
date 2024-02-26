import java.util.Scanner;

public class luaslingkaran {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double luas,keliling;

        System.out.print("Masukkan jari-jari : ");
        double r= input.nextDouble();

        luas = phi * r * r;
        keliling = 2 * phi * r;

        System.out.println("Hasil luas lingkarannya adalah = " + luas);
        System.out.println("Hasil Keliling nya adalah = " + keliling);

    }
}
