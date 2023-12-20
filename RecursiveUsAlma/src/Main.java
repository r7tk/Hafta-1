import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz : ");
        int taban = scanner.nextInt();

        System.out.println("Üs Değerini Giriniz : ");
        int us = scanner.nextInt();

        if (us < 0) {
            System.out.println("Üs Değeri Negati Değerler içeremez. ");

        } else {
            int result = UsHesapla(taban, us);
            System.out.println(taban + "^" + us + "=" + result);
        }
    }

    // Recursive metot kısımı burası
    public static int UsHesapla(int taban, int us) {
        if (us == 0) {
            return 1; // Her sayının 0. kuvveti 1'dir.
        } else if (us % 2 == 0) {
            int half = UsHesapla(taban, us / 2); // Recursive çağrı olan kısım
            return half * half;
        } else {                                       // Recursive çağrı olan kısım
            return taban * UsHesapla(taban, us - 1);
        }
    }
}
