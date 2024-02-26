import java.util.Scanner;

public class luassegitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double luas;

        System.out.print("Masukkan Alas : ");
        double a= input.nextDouble();

        System.out.print("Masukkan Tinggi : ");
        double t= input.nextDouble();

        luas = a * t / 2;

        System.out.println("Hasil Luas Segitiganya Adalah = " + luas);
    }
}
