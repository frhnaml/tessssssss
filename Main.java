import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double panjang, lebar, tinggi;
       double perhitungan;

        System.out.println("Masukan panjang alas limas (dalam cm): ");
        panjang = sc.nextDouble();

        System.out.println("Masukan lebar alas limas (dalam cm): ");
        lebar = sc.nextDouble();

        System.out.println("Masukan tinggi limas (dalam cm): ");
        tinggi = sc.nextDouble();

        perhitungan = 0.333 * panjang * lebar * tinggi;

        System.out.println("Volume limas segi empat = " + perhitungan +" cm^3");
    }
}